import java.util.Scanner;

// find largest

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking array size
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // taking inputs for an array
        System.out.println("Write the input: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // output
        System.out.println("largest number is: "+ myfunction(arr));

    }

    static int myfunction(int arr[]){
        int largest = arr[0];
        for (int i=0; i< arr.length; i++){
           if (arr[i]>largest){
               largest = arr[i];
           }
        }
        return largest;
    }
}



