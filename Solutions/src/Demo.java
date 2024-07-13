import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class  Demo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking Size of an array
        System.out.println("Enter the Size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        // Taking array inputs from the user
        System.out.println("Enter the elements: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // calling the function
        int result = largestElement(arr);
        System.out.println("Largest element is: "+result);

    }

    static  int largestElement(int arr[]){
        int largest = arr[0];
        for (int i=0; i< arr.length-1; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}



