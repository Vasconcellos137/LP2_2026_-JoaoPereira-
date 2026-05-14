import java.util.Scanner;

public class Main {
   static java.util.Scanner Ler = new java.util.Scanner(System.in);

   public static int LerNumInt() {
      int num = 0;

      num = Ler.nextInt();

      return num;
   }

   public static void main(String[] args) {
      StringBuffer palavra = new StringBuffer();
      int testes = LerNumInt();
      Ler.nextLine();

      for (int i = 0; i < testes; i++) {
         String frase = "";
         frase = Ler.next();

         palavra.append(frase);

         for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
               palavra.append((char) (c + 3));
            } else {
               palavra.append(c);
            }

            palavra.reverse();

         }
         int metade = palavra.length() / 2;
         for (int j = metade; j < palavra.length(); j++) {
            palavra.setCharAt(j, (char) (palavra.charAt(i) - 1));
         }

         System.out.println(palavra.toString());
      }
   }

}
