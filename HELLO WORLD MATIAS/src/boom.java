import java.util.Scanner;

public class boom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el 1ºnumero: ");
        num1= sc.nextInt();
        System.out.print("Ingrese el 2ºnumero: ");
        num2= sc.nextInt();
        if (num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int sum = 0;
        for(int i=num1; i<=num2; i++ ){
            sum+=i;
        }
        System.out.println("La suma de los números es: "+sum);
    }
}

