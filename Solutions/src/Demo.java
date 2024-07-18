import java.util.ArrayList;
import java.util.Scanner;

// factorial

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the array size
        System.out.println("Enter the number size: ");
        int size = sc.nextInt();

        // output
       int result = myFunction(size);
        System.out.println("Factorial is: "+ result);


    }
    static int myFunction(int num){
        int fact = 1 ;
        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }

}



