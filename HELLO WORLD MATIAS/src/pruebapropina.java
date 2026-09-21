import java.util.Scanner;

public class pruebapropina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas personas habian? : ");
        int totalpersonas= sc.nextInt();
        System.out.println("¿Cuantas dieron propina?: ");
        int Dieronpropina= sc.nextInt();
        System.out.println("¿Cuantas no dieron propina?: ");
        int Nodieronpropina= sc.nextInt();

        while (true){
            System.out.println("DIME EL TOTAL DE LA CUENTA ");
            double totalcuenta= sc.nextDouble();

            System.out.println("¿DESEA DEJAR PROPINA?(Y/N) ");
            String Respuestapropina= sc.next();
            double propina=0;

            if (Respuestapropina.equalsIgnoreCase("Y")){
                System.out.println("¿Cuanto seria la propina?");
                propina= sc.nextDouble();
                Dieronpropina++;
            } else if (Respuestapropina.equalsIgnoreCase("N")){
                System.out.println("Muchas gracias por su compra");
                Nodieronpropina++;
                continue;
            } else{
                System.out.println("Opcion no valida");
                totalpersonas++;
                break;
            }
            double porcentajeConPropina = (double) Dieronpropina / totalpersonas * 100;
            double porcentajeSinPropina = (double) Nodieronpropina / totalpersonas * 100;

            System.out.println("\n RESULTADOS");
            System.out.println("Total de personas atendidas"+totalpersonas);
            System.out.println("Total de Propina:"+Dieronpropina+" (" + String.format("%.2f", porcentajeConPropina) + "%)");
            System.out.println("No dieron propina: " + Nodieronpropina + " (" + String.format("%.2f", porcentajeSinPropina) + "%)");

            sc.close();

        }
    }
}