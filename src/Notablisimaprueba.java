import java.util.Scanner;

public class Notablisimaprueba {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int usuario = 0;
        System.out.println("Número de usuarios a ingresar:");
        int Nota = input.nextInt();
        input.nextLine();
        int Estudiante1 = 0;
        int Estudiante2 = 0;
        int Estudiante3 = 0;
        int Estudiante4 = 0;
        String Nota1 = "";
        String Nota2 = "";
        String Nota3 = "";
        for(Nota3 = ""; usuario < Nota; ++usuario){
            System.out.println("Nombre del usuario:");
            String nomusuario = input.nextLine();
            System.out.println("Notas del estudiante:");
            int notaestudent = input.nextInt();
            input.nextLine();
            double promedio =(Nota1 + Nota2 + Nota3)/3;
            if (promedio >= 3 ) {
                System.out.println(" no aprueba");
            } else if (notaestudent <= 3.0 ) {
                System.out.println( notaestudent+ " aprueba.");
            }
        }
    }
}
