import java.util.Scanner;

// array Sum

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the array size
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // enter the array element
        System.out.println("Enter the array element: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // output
        int result = myFunction(arr);
        System.out.println("Sum of an array is: " + result);
    }

    static int myFunction(int[] arr1){
        int sum = 0;
        for (int i=0; i<= arr1.length; i++){
            sum = sum + i;
        }
        return sum;
    }
}



