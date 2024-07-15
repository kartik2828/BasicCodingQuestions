import java.util.Scanner;

// sum of digits of an array

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
        System.out.println(myfunction(arr));

    }

    static int myfunction(int arr[]){
        int sum = 0;
        for (int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}



