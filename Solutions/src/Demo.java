import java.sql.SQLOutput;
import java.util.Scanner;

class Demo{

    // 2. Reverse a String

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(name);

        System.out.println(sb.reverse());


    }
}