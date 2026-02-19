public class App {
    static java.util.Scanner LER = new java.util.Scanner(System.in);

    public static int Lernumint() {
        int num = 0;

        num = LER.nextInt();

        return num;
    }
    public static void main(String[] args) throws Exception {
      

        
    }
    /*Escreva um programa que receba uma matriz A(5,5) e retorne a soma dos seus elementos. */
    public static void Matrizde5() {
        int [][] matrizde5 = new int [5][5];
        int soma = 0;

        for (int i = 0; i < matrizde5.length; i++) {
            for (int j = 0; j < matrizde5[i].length; j++) {
                matrizde5[i][j] = Lernumint(); 
            }
        }

        for (int i = 0; i < matrizde5.length; i++) {
            for (int j = 0; j < matrizde5[i].length; j++) {
                soma += matrizde5[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }
}
