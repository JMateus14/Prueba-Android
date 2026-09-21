import java.util.Scanner;

public class PROPINA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIME EL MONTO TOTAL DE LA CUENTA:" );
        double totalcuenta = sc.nextDouble();

        System.out.println("¿DESEA DEJAR PROPINA? (Y/N)");
        String Rpropina = sc.next();

        double propina = 0;

        if (Rpropina.equalsIgnoreCase("Y")) {
            System.out.println("¿Cuanto seria la propina?");
            propina = sc.nextDouble();
        } else if (Rpropina.equalsIgnoreCase("N")) {
            System.out.println("Muchas gracias por su visita");
        }
    }
}
