import java.util.Scanner;
public class calcu2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continuar;

            do {
                mostrarMenu();
                int opcion = scanner.nextInt();
                continuar = procesarOpcion(opcion, scanner);
            } while (continuar);

            scanner.close();
            System.out.println("Gracias por usar la calculadora.");
        }

        private static void mostrarMenu() {
            System.out.println("===== MENÚ DE LA CALCULADORA =====");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");
        }


        private static boolean procesarOpcion(int opcion, Scanner scanner) {
            if (opcion == 5) {
                System.out.println("Salimos de la calculadora.");
                return false;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no válida. Vuelve a intentarlo.");
                return true;
            }


            double num1 = solicitarNumero(scanner, "1er número (Solo positivos): ");
            double num2 = solicitarNumero(scanner, "2do número (Solo positivos): ");


            realizarOperacion(opcion, num1, num2);

            return true;
        }


        private static double solicitarNumero(Scanner scanner, String mensaje) {
            double numero;
            do {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                if (numero < 0) {
                    System.out.println("Solo se admiten números positivos. Vuelve a intentarlo.");
                }
            } while (numero < 0);
            return numero;
        }


        private static void realizarOperacion(int opcion, double num1, double num2) {
            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado de la división: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Error inesperado.");
            }
        }
    }

