package Day1;

import java.util.Scanner;

public class swapTwoNumbers{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping first number is: " + a +" & "+"second number is: "+b );
    }

}
