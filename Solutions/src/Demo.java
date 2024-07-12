import java.sql.SQLOutput;
import java.util.Scanner;

class Demo{

   // pallindrome string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        Demo obj = new Demo();
        System.out.println(obj.demo1(name1));

    }

    boolean demo1(String name){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.reverse();

        return sb.toString().equals(name);
    }
}