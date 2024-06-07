package Day1;

import java.util.Scanner;

// 2. Reverse a Number

public class reverseANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;

        while (num!=0){
            reverse= reverse*10 + num%10;
            num = num/10;
        }
        System.out.println(reverse);

        // **************            String Builder method   *****************
//        StringBuilder sb = new StringBuilder();
//        sb.append(num);
//        System.out.println(sb.reverse());
    }

}
