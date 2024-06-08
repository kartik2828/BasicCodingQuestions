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
