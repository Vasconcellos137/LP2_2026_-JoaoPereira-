public class DesenharLetraMatematica {
    static java.util.Scanner LER = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int num = 0;

        num = LER.nextInt();

        return num;
    }

    public static void main(String[] args) {

        char letra = ' ';

        System.out.print("Digite uma letra maiúscula (A-Z): ");
        letra = LER.next().charAt(0);

        switch (letra) {
            case 'A':
                CriarA();
                break;
            case 'B':
                CriarB();
                break;
            case 'C':
                CriarC();
                break;
            case 'D':
                CriarD();
                break;
            case 'E':
                CriarE();
                break;
            case 'F':
                CriarF();
                break;
            case 'G':
                CriarG();
                break;
            case 'H':
                CriarH();
                break;
            case 'I':
                CriarI();
                break;
            case 'J':
                CriarJ();
                break;
            case 'K':
                CriarK();
                break;
            case 'L':
                CriarL();
                break;
            case 'M':
                CriarM();
                break;
            case 'N':
                CriarN();
                break;
            case 'O':
                CriarO();
                break;
            case 'P':
                CriarP();
                break;
            case 'Q':
                CriarQ();
                break;
            case 'R':
                CriarR();
                break;
            case 'S':
                CriarS();
                break;
            case 'T':
                CriarT();
                break;
            case 'U':
                CriarU();
                break;
            case 'V':
                CriarV();
                break;
            case 'W':
                CriarW();
                break;
            case 'X':
                CriarX();
                break;
            case 'Y':
                CriarY();
                break;
            case 'Z':
                CriarZ();
                break;

            default:
        }

    }

    public static void CriarA() {
        int altura = 40;
        int largura = 2 * altura - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {

                if (j == altura - i - 1 || // Lado esquerdo
                        j == altura + i - 1 || // Lado direito
                        (i == altura / 2 && j > altura - i - 1 && j < altura + i - 1) // Meio
                ) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Pula linha
        }
    }

    public static void CriarB() {
        int altura = 0;
        int largura = 5;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {

                if (j == 0 ||
                        ((i == 0 || i == altura / 2 || i == altura - 1) && j < largura - 1) ||
                        (j == largura - 1 && i != 0 && i != altura / 2 && i != altura - 1)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Quebra de linha
        }
    }

    public static void CriarC() {
        int altura = 0;
        int largura = 5;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {

                if (j == 0 ||
                        (i == 0 && j > 0) ||
                        (i == altura - 1 && j > 0)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Nova linha
        }
    }

    public static void CriarD() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (j == 0 ||
                        ((i == 0 || i == altura - 1) && j < altura - 1) ||
                        (j == altura - 1 && i > 0 && i < altura - 1)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Quebra de linha
        }
    }

    public static void CriarE() {
        int altura = 0;

        altura = LerNumInt();

        for (int l = 0; l < altura; l++) {
            for (int c = 0; c < altura; c++) {
                // Lógica matemática baseada na posição do loop
                if (c == 0 || l == 0 || l == altura / 2 || l == altura - 1) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaço vazio
                }
            }
            System.out.println(); // Pula linha
        }
    }

    public static void CriarF() {
        int altura = 7;
        int largura = 5;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {

                if (j == 0 || i == 0 || i == altura / 2) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaço vazio
                }
            }
            System.out.println(); // Pula linha
        }
    }

    public static void CriarG() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if ((j == 0) || // Borda esquerda
                        (i == 0 && j > 0) || // Topo
                        (i == altura - 1 && j > 0 && j < altura - 1) || // Base
                        (i >= altura / 2 && j == altura - 1) || // Borda direita inferior
                        (i == altura / 2 && j >= altura / 2)) { // Meio
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println();
        }
    }

    public static void CriarH() {
        int altura = 7;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int i = 0; i < altura; i++) { // Laço das linhas
            for (int j = 0; j < altura; j++) { // Laço das colunas

                if (j == 0 || j == altura - 1 || i == altura / 2) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Pula linha
        }
    }

    public static void CriarI() {
        int altura = 0;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                // Condições para desenhar a letra I
                if (linha == 0 || linha == altura - 1 || coluna == altura / 2) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Pula para a próxima linha
        }
    }

    public static void CriarJ() {
        int altura = 7;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) { // Linhas
            for (int j = 0; j < altura; j++) { // Colunas

                if (i == 0 ||
                        j == altura / 2 ||
                        (i == altura - 1 && j < altura / 2) ||
                        (j == 0 && i > altura / 2 && i < altura - 1)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaço vazio
                }
            }
            System.out.println(); // Nova linha
        }
    }

    public static void CriarK() {
        int altura = 0;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Lógica Matemática:
                // Coluna 0 OU a diagonal que varia conforme a linha
                if (j == 0 || j == Math.abs(altura / 2 - i)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println();
        }
    }

    public static void CriarL() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (j == 0 || i == altura - 1) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaços em branco
                }
            }
            System.out.println(); // Quebra de linha
        }
    }

    public static void CriarM() {
        int altura = 0;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (j == 0 || j == altura - 1 || (i == j && i <= altura / 2)
                        || (j == altura - i - 1 && i <= altura / 2)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaços em branco
                }
            }
            System.out.println(); // Nova linha
        }
    }

    public static void CriarN() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Lógica: Primeira col, última col, ou diagonal principal
                if (j == 0 || j == altura - 1 || i == j) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaços em branco
                }
            }
            System.out.println(); // Nova linha
        }
    }

    public static void CriarO() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) { // Laço das linhas
            for (int j = 0; j < altura; j++) { // Laço das colunas

                if ((i == 0 || i == altura - 1) && (j > 0 && j < altura - 1)) {

                    System.out.print("▉");
                } else if ((j == 0 || j == altura - 1) && (i > 0 && i < altura - 1)) {

                    System.out.print("▉");
                } else if ((i == 0 || i == altura - 1) && (j == 0 || j == altura - 1)) {

                    System.out.print("▉");
                } else {

                    System.out.print("░");
                }
            }
            System.out.println(); // Pula linha
        }
    }

    public static void CriarP() {
        int altura = 0;
        int largura = 5;

        altura = LerNumInt();

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {

                if (x == 0 ||
                        ((y == 0 || y == altura / 2) && x < largura - 1) ||
                        (x == largura - 1 && y > 0 && y < altura / 2)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println();
        }
    }

    public static void CriarQ() {
        int altura = 0;
        double centro = altura / 2.0;
        double raioExterno = altura / 2.5;
        double raioInterno = altura / 4.0;

        altura = LerNumInt();

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < altura; x++) {

                double dx = x - centro;
                double dy = y - centro;
                double distancia = Math.sqrt(dx * dx + dy * dy);

                if (distancia < raioExterno && distancia > raioInterno) {
                    System.out.print("▉");
                }

                else if (x > centro && y > centro && x == y && x < altura - 1) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Nova linha
        }
    }

    public static void CriarR() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (j == 0 ||
                        (i == 0 || i == altura / 2) && j < altura - 1 ||
                        j == altura - 1 && i < altura / 2 && i != 0 ||
                        (i == j && i >= altura / 2)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Nova linha
        }
    }

    public static void CriarS() {
        int altura = 0;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Lógica de Preenchimento
                if ((i == 0 || i == altura / 2 || i == altura - 1)
                        || (i < altura / 2 && j == 0)
                        || (i > altura / 2 && j == altura - 1)) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Quebra de linha
        }
    }

    public static void CriarT() {
        int altura = 0;
        int largura = 7;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {

                if (i == 0 || j == largura / 2) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaço em branco
                }
            }
            System.out.println(); // Quebra de linha
        }
    }

    public static void CriarU() {
        int altura = 7;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if ((j == 0 || j == altura - 1) && i < altura - 1) {
                    System.out.print("▉");
                } else if (i == altura - 1 && j > 0 && j < altura - 1) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaço vazio
                }
            }
            System.out.println(); // Pula linha
        }
    }

    public static void CriarV() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < (2 * altura - 1); j++) {

                if (j == i || j == (2 * altura - 2) - i) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaço vazio
                }
            }
            // Quebra de linha
            System.out.println();
        }
    }

    public static void CriarW() {
        int altura = 0;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (j == 0 || j == altura - 1 || (i >= altura / 2 && (j == i || j == altura - 1 - i))) {
                    System.out.print("▉");
                } else {
                    System.out.print("░"); // Espaço vazio
                }
            }
            System.out.println(); // Quebra de linha
        }
    }

    public static void CriarX() {
        int altura = 0;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (i == j || j == altura - i - 1) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Pula para a próxima linha
        }
    }

    public static void CriarY() {
        int altura = 7;

        do {
            altura = LerNumInt();
        } while (altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (i <= altura / 2 && (j == i || j == altura - 1 - i)) {
                    System.out.print("▉");
                }

                else if (i > altura / 2 && j == altura / 2) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Pula linha
        }
    }

    public static void CriarZ() {
        int altura = 0;

        altura = LerNumInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                if (i == 0 || i == altura - 1 || j == altura - 1 - i) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Nova linha
        }
    }
}
