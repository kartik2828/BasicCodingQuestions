package Day3;

import java.util.Scanner;

// check the given number is prime or not

public class primeNumber {

    public static boolean checkPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(checkPrime(num1));
    }
}
