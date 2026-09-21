import java.util.Scanner;

/*Necesitamos escribir un programa para una máquina expendedora simple.
Los productos disponibles son agua, zumos y refrescos. El programa debe preguntar al usuario si quiere una botella de agua. Si la respuesta del usuario es “SI”, mostrará el precio y finalizará el programa.
Si el usuario no quiere agua, la máquina le preguntará si quiere zumo. Si la respuesta del usuario es “SI”, mostrará el precio y finalizará el programa.
Si el usuario tampoco quiere el zumo, la máquina le preguntará si quiere un refresco.
Posibles respuestas del usuario: y, Y, n, N (debe considerar opciones tanto en mayúsculas como en minúsculas)*/

public class estructuresdecontrol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra");
        char letra = sc.next().charAt(0);

        letra = Character.toUpperCase(letra);

        if(letra == 'A'|| letra=='E'|| letra=='I'|| letra=='O'|| letra=='U'){
            System.out.println("El letra " + letra +" es un vocal");
        }
        else if (letra =='B'||letra =='C'||letra =='D'||letra =='F'||letra =='G'||letra=='H'||letra=='J'||letra=='K'||letra=='L'||letra=='M'||letra=='N'||letra=='P'||letra=='Q'||letra=='R'||letra=='S'||letra=='T' ||letra=='V'||letra=='W'||letra=='X'||letra=='Y'||letra=='Z'){
            System.out.println("El letra " + letra +" es una consonante");
        }
        else {
           System.out.println("No es una letra valida");
        }
    }
}

