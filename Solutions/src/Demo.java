import java.util.ArrayList;
import java.util.Scanner;

// Smallest and largest number

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the array size
        System.out.println("Enter the number size: ");
        int size = sc.nextInt();

        int arr[] =  new int[size];
        // output
        System.out.println("Enter array element");
        for (int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
     myFunction(arr);

    }
    static void myFunction(int[] num){
        int min =  Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<num.length; i++){
            if (num[i]>max){
                max = num[i];
            }
            if (num[i]<min){
                min = num[i];
            }

        }
        System.out.println("Maximum value"+ max);
        System.out.println("Minimum value"+ min);
    }

}



