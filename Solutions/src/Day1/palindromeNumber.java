package Day1;

import java.util.Scanner;

// 4. Palindrome Number
public class palindromeNumber {

    static boolean palindrome(int num){
        int originalNum = num;
        int rev = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev==originalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(palindrome(num1));
    }
}
