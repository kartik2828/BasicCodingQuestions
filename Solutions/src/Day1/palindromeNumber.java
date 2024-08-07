package Day1;

import java.util.Scanner;

// 4. Palindrome Number
class palindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindromeNumber obj = new palindromeNumber();

        System.out.println(obj.demo1(n));
    }

    boolean demo1(int num){
        int rev  = 0;
        int originalNumber = num;

        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev == originalNumber;
    }
}
