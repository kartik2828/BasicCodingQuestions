package Day1;

import java.util.Scanner;

// 3. Reverse a String

public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(name);
        System.out.println(sb.reverse());

    }
}
