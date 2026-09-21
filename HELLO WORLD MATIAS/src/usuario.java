import java.util.Scanner;

public class usuario {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num = sc.nextInt();

        System.out.println("Tabla de multiplicar del "+ num);
        for(int i=1;i<=10;i++){
            System.out.println(num +"x"+i+"="+(num*i));


        }

    }
}
