import java.util.Scanner;

public class matias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pingcorrecto= "2984";
        String pingIngresado;

        do   {
                 System.out.println("Ingrese su Ping de 4 dígitos: ");
                 pingIngresado = sc.nextLine();
                 if (!pingIngresado.equals(pingcorrecto)) {
                 System.out.println("¡Ping Incorrecto!  Intentelo de nuevo");

             }
        } while (!pingIngresado.equals(pingcorrecto));
        System.out.println("¡Ping correcto! Tarjeta aceptada");
        sc.close();
    }
}
/*Escriba un programa que cree una cuenta regresiva de 10 a cero y luego escriba "¡BOOOM!"*/


