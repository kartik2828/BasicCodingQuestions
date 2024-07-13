import java.sql.SQLOutput;
import java.util.Scanner;

class Demo{

    // reverseString

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        String result = String.valueOf(sb.reverse());

        System.out.println(result);
    }

    }
