import java.util.ArrayList;
import java.util.Scanner;

// prime number

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the array size
        System.out.println("Enter the number size: ");
        int size = sc.nextInt();

        // output
       boolean result  = myFunction(size);
        System.out.println(result);


    }
    static boolean myFunction(int num){
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }

        }
        return true;
    }

}



