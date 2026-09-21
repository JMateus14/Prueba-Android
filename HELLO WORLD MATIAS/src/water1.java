
import java.util.Scanner;

public class water1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precioAgua = 1.00;
        double precioZumo = 1.50;
        double precioRefresco = 2.50;
        String respuesta;

        System.out.println("Los valores son: S = SI y N = NO");
        System.out.println("¿Necesita una botella de agua? (S/N): ");
        respuesta = sc.next().toUpperCase();

        if (respuesta.equals("S")) {
            System.out.println("El precio es " + precioAgua + "€");
        } else if (respuesta.equals("N")) {
            System.out.println("¿Quiere un zumito? (S/N): ");
            respuesta = sc.next().toUpperCase();

            if (respuesta.equals("S")) {
                System.out.println("El precio es " + precioZumo + "€");
            } else if (respuesta.equals("N")) {
                System.out.println("¿Quiere un refresco? (S/N): ");
                respuesta = sc.next().toUpperCase();

                if (respuesta.equals("S")) {
                    System.out.println("El precio es " + precioRefresco + "€");
                } else {
                    System.out.println("No hay ningún producto seleccionado");
                }
            }
        }
    }
}
