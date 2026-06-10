import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Matchmaking {
    static Scanner Ler = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<String> filaJogadores = new LinkedList<>();

        String nomeJogador = " ";
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n---Matchmaking---");
            System.out.println("1. Entrar jogador");
            System.out.println("2. Atender jogador");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Mostrar tamanho");
            System.out.println("0. Sair");
            System.out.print("opção: ");
            opcao = Ler.nextInt();

            switch (opcao) {
                case 1:
                    nomeJogador = Ler.next();
                    filaJogadores.add(nomeJogador);
                    break;

                case 2:
                    if (filaJogadores.isEmpty()) {
                        System.out.println("Fila vazia!");
                    } else {
                        filaJogadores.poll();
                    }
                    break;

                case 3:
                    System.out.println("jogadores:");
                    for (String jogadores : filaJogadores) {
                        System.out.println(jogadores);
                    }
                    break;

                case 4:
                    System.out.println(filaJogadores.size());
                    break;

                case 0:
                    break;
            }
        }
    }
}