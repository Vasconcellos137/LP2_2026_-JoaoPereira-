public class App {
    static java.util.Scanner LER = new java.util.Scanner(System.in);

    public static double LernumDouble() {
        double num = 0;

        num = LER.nextDouble();

        return num;
    }

    public static void main(String[] args) throws Exception {

        CalcularProdutoMatricial();

    }

    /*
     * 1. Escreva um programa que receba uma matriz A(5,5) e retorne a soma dos seus
     * elementos.
     */
    public static void CalcularASoma() {
        double[][] matrizde5 = new double[5][5];
        double soma = 0;

        for (int i = 0; i < matrizde5.length; i++) {
            for (int j = 0; j < matrizde5[i].length; j++) {
                matrizde5[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde5.length; i++) {
            for (int j = 0; j < matrizde5[i].length; j++) {
                soma += matrizde5[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }

    /*
     * 2. Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos
     * elementos da sua diagonal principal.
     */
    public static void CalcularAsomadadiagonalprincipal() {
        double[][] matrizde6 = new double[6][6];
        double soma = 0;

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                if (i == j) {
                    soma += matrizde6[i][j];
                }
            }
        }

        System.out.println("soma da diagonal principal: " + soma);
    }

    /*
     * 3. Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos
     * elementos da sua diagonal secundária.
     */
    public static void CalcularAsomaDaDiagonalSecundaria() {
        double[][] matrizde6 = new double[6][6];
        double soma = 0;

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                if (i + j == 6 - 1) {
                    soma += matrizde6[i][j];
                }
            }
        }

        System.out.println("soma da diagonal secundaria: " + soma);
    }

    /*
     * 4. Escreva um programa que receba uma matriz A(7,6) e retorne a soma dos
     * elementos da linha 5 e da coluna 3.
     */
    public static void CalcularAsomaDaLinhaeColuna() {
        double[][] matrizde76 = new double[7][6];
        double somacoluna = 0;
        double somatotal = 0;
        double somalinha = 0;

        for (int i = 0; i < matrizde76.length; i++) {
            for (int j = 0; j < matrizde76[i].length; j++) {
                matrizde76[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde76.length; i++) {
            for (int j = 0; j < matrizde76[i].length; j++) {
                somacoluna += matrizde76[i][2];
            }
        }

        for (int i = 0; i < matrizde76.length; i++) {
            for (int j = 0; j < matrizde76[i].length; j++) {
                somalinha += matrizde76[4][j];
            }
        }

        somatotal = somalinha + somacoluna;

        System.out.println("soma de todos elementos da linha 5: " + somalinha);
        System.out.println("soma de todos elementos da coluna 3: " + somacoluna);
        System.out.println("soma da linha 5 e coluna 3: " + somatotal);
    }

    /*
     * 5. Escreva um programa que receba uma matriz A(6,6) e retorne o menor
     * elemento
     * da sua diagonal secundária.
     */
    public static void EncontrarOMenorNumeroEmUmaMatriz() {
        double[][] matrizde6 = new double[6][6];
        double menor = 99999999;

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                if (matrizde6[i][j] < menor) {

                    menor = matrizde6[i][j];
                }
            }
        }

        System.out.println("menor numero: " + menor);
    }

    /*
     * 6. Escreva um programa que receba uma matriz A(8,8) e calcule o maior
     * elemento da sua
     * diagonal principal. A seguir, o algoritmo deve dividir todos os elementos de
     * A pelo maior
     * encontrado e armazenando em uma matriz B(8,8).
     */
    public static void EncontrarMaiorValorEDividiir() {
        double[][] matrizde8A = new double[8][8];
        double[][] matrizde8B = new double[8][8];
        double maior = 0;

        for (int i = 0; i < matrizde8A.length; i++) {
            for (int j = 0; j < matrizde8A[i].length; j++) {
                matrizde8A[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde8A.length; i++) {
            for (int j = 0; j < matrizde8A[i].length; j++) {
                if (matrizde8A[i][j] > maior) {
                    maior = matrizde8A[i][j];
                }
            }
        }

        for (int i = 0; i < matrizde8B.length; i++) {
            for (int j = 0; j < matrizde8B[i].length; j++) {
                matrizde8B[i][j] = matrizde8A[i][j] / maior;
            }
        }

        for (int i = 0; i < matrizde8B.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matrizde8B.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matrizde8B[i].length; j++) {
                System.out.printf("%.2f ", matrizde8B[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * Escreva um programa que receba duas matrizes A(4,6) e B(6,4) e retorne uma
     * matriz C, que
     * seja o produto matricial de M por N
     */
    public static void CalcularProdutoMatricial() {
        double[][] matrizA = new double[4][6];
        double[][] matrizB = new double[6][4];
        double[][] matrizC = new double[4][4];
        double contadorA = 0;
        double contadorB = 0;



        System.out.println("matriz A");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = contadorA++;
            }
        }

        System.out.println("matriz B");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = contadorB++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int j2 = 0; j2 < 6; j2++) {
                    matrizC[i][j] += matrizA[i][j2] * matrizB[j2][j];
                }
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matrizC.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.printf("%.2f ", matrizC[i][j]);
            }
            System.out.println();
        }
    }
}
