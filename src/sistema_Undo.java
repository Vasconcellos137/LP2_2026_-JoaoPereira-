import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class sistema_Undo {
    static Scanner Ler = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<String> pilhaUndo = new ArrayDeque<>();
        int opcao = -1;
        String escrito = "";

        while (0 != opcao) {
            System.out.println("\n---Sistema undo---");
            System.out.println("1. Digitar texto");
            System.out.println("2. Desfazer");
            System.out.println("3. Mostrar histórico");
            System.out.println("0. Sair");
            System.out.print("opção: ");

            opcao = Ler.nextInt();

            switch (opcao) {
                case 1:
                    escrito = Ler.next();
                    pilhaUndo.push(escrito);
                    break;

                case 2:
                    if (pilhaUndo.isEmpty()) {
                        System.out.println("Nada para desfazer!");
                    } else {
                        System.out.println("o " + pilhaUndo.peek() + " foi desfeito");
                        pilhaUndo.pop();
                    }
                    break;

                case 3:
                    System.out.println("histórico:");
                    for (String historico : pilhaUndo) {
                        System.out.println(historico);
                    }
                    break;

                case 0:
                    break;
            }
        }
    }
}
