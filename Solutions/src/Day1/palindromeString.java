package Day1;

// 5. Palindrome String
import java.util.Scanner;

public class palindromeString {
    static boolean palindrome(String x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.reverse();
        return sb.toString().equals(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(palindrome(name));
    }
}
