import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;
// Pallindrome Number

public class  Demo{

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(myFunction(num1));
    }

    static boolean myFunction(int num){
        int finalNumber =  num;
        int rev  = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return finalNumber ==rev;
    }
}



