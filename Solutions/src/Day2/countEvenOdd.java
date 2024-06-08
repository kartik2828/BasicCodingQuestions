package Day2;

import java.util.Scanner;

// 7. Count the number of even and odd digits in a number
public class countEvenOdd {

    static void EVenOdd(int digit){
        int even = 0;
        int odd = 0;
        while (digit!=0){
            int num = digit%10;
            if(digit%2==0){
                even++;
            }else{
                odd++;
            }
            digit = digit/10;
        }
        System.out.println("Even count "+even);
        System.out.println("Odd count: "+odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit1 = sc.nextInt();
        EVenOdd(digit1);
    }
}
