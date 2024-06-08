package Day2;

import java.util.Scanner;

// 6. Count the number of digits in a number
public class countOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Number of digits are: "+ count);
    }
}
