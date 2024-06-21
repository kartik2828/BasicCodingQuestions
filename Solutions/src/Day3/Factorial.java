package Day3;

import java.util.Scanner;

public class Factorial {

    // Check the factorial of a number

    public static void checkFactorial(int num){
        int result = 1;
        if (num<=0){
            System.out.println("Invalid input");
        }
        for (int i=1; i<=num; i++){
            result  = result * i;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        checkFactorial(num1);
    }

}
