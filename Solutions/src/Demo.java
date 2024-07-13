import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;
// count of digits

public class  Demo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the Size of an array
        System.out.println("Enter the Size of an array: ");
        int size = sc.nextInt();

        int arr[] =  new int[size];

        // Taking the input element
        System.out.println("Enter the element: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // result
        int result = digitsSum(arr);
        System.out.println("count is: "+result);
    }
    static int digitsSum(int arr[]){
        int  count = 0;
        for(int i=0; i< arr.length; i++){
            count++;
        }
        return count;
    }
}



