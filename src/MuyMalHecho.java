import java.util.Scanner;

public class MuyMalHecho {
   public MuyMalHecho() {
   }

   public static void main(String[] args) throws Exception {
      Scanner S = new Scanner(System.in);
      int C = 0;
      System.out.println("Número de usuarios a ingresar:");
      int N = S.nextInt();
      S.nextLine();
      int E1 = 0;
      int E2 = 0;
      int E3 = 0;
      String N1 = "";
      String N2 = "";
 
      String N3;
      for(N3 = ""; C < N; ++C){
         System.out.println("Nombre del usuario:");
         String U = S.nextLine();
         System.out.println("Edad del usuario:");
         int A = S.nextInt();
         S.nextLine();
         if (C == 0) {
            N1 = U;
            E1 = A;
         } else if (C == 1) {
            N2 = U;
            E2 = A;
         } else if (C == 2) {
            N3 = U;
            E3 = A;
         }

         if (A >= 18) {
            System.out.println(U + " es mayor de edad.");
         } else {
            System.out.println(U + " es menor de edad.");
         }

         if (A > 120 || A < 1) {
            System.out.println("Edad no válida.");
         }
      }

      System.out.println("Resumen:");
      System.out.println("Usuario 1: " + N1 + " - Edad: " + E1);
      System.out.println("Usuario 2: " + N2 + " - Edad: " + E2);
      System.out.println("Usuario 3: " + N3 + " - Edad: " + E3);
   }
}
