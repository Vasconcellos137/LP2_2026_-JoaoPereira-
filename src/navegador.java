import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class navegador {
    static java.util.Scanner Ler = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        Deque<String> navegador = new ArrayDeque<>();
        Queue<String> downloads = new LinkedList<>();
        int opcao = -1;
        String escrito = "";

        while (opcao != 0) {
            System.out.println("\n---Navegador---");
            System.out.println("1. Abrir pagina");
            System.out.println("2. voltar pagina");
            System.out.println("3. Mostrar historico");
            System.out.println("4. Adicionar download");
            System.out.println("5.Processar download");
            System.out.println("6.Mostrar downloads");
            System.out.println("0. Sair");
            System.out.print("opção: ");
            opcao = Ler.nextInt();

            switch (opcao) {
                case 1:
                    escrito = Ler.next();
                    navegador.push(escrito);
                    break;
                case 2:
                    if (navegador.isEmpty()) {
                        System.out.println("Não há o que voltar!");
                    } else {
                        navegador.pop();
                    }
                    break;
                case 3:
                    System.out.println("histórico:");
                    for (String historico : navegador) {
                        System.out.println(historico);
                    }
                    break;
                case 4:
                    escrito = Ler.next();
                    downloads.add(escrito);
                    break;
                case 5:
                    if (downloads.isEmpty()) {
                        System.out.println("Não há download para processar!");
                    } else {
                        downloads.poll();
                    }
                    break;
                case 6:
                    System.out.println("downloads:");
                    for (String historico : downloads) {
                        System.out.println(historico);
                    }
                    break;

                case 0:
                    break;

                default:
                    break;
            }
        }
    }
}
