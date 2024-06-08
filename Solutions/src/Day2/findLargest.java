package Day2;

import java.util.Scanner;
// 9. Find the largest of 3 Numbers

public class findLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1+" is largest");
        } else if (num2>num1 & num2>num3) {
            System.out.println(num2+" is largest");
        }else {
            System.out.println(num3+" is largest");
        }
    }
}
