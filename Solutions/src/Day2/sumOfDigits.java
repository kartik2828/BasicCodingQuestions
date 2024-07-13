package Day2;

import java.util.Scanner;

// 8. Count the sum of digits in a number
public class sumOfDigits {

    static void digitSum(int digit){
    int result = 0;
        while (digit!=0){
            result = result + digit%10;
            digit = digit/10;
        }
        System.out.println(result);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit1 = sc.nextInt();
        digitSum(digit1);
    }
}


/*
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
        System.out.println("Sum is: "+result);
    }
    static int digitsSum(int arr[]){
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}



 */