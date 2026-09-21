import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Año: ");
        int año= sc.nextInt();


        String Nombremes=("");

        switch (mes) {
            case 1:
                Nombremes =("Enero");
                break;
            case 2:
                Nombremes=("Febrero");
                break;
            case 3:
                Nombremes=("Marzo");
                break;
            case 4:
                Nombremes=("Abril");
                break;
            case 5:
                Nombremes=("Mayo");
                break;
            case 6:
                Nombremes =("Junio");
                break;
            case 7:
                Nombremes =("Julio");
                break;
            case 8:
                Nombremes =("Agosto");
                break;
            case 9:
                Nombremes =("Septiembre");
                break;
            case 10:
                Nombremes =("Octubre");
                break;
            case 11:
                Nombremes =("Noviembre");
                break;
            case 12:
                Nombremes =("Diciembre");
                break;
            case 13:
                Nombremes = ("Proba canvi Guillem")

            default:
                Nombremes =("Opción no válida");
                return;
        }

        System.out.println("Soy del " + dia + " de " + Nombremes + " de " + año);
    }
}

