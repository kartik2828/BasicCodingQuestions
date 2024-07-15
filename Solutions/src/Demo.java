import java.util.Scanner;

// reverse a String

public class  Demo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();

   StringBuilder sb = new StringBuilder();
   sb.append(name);
        System.out.println(sb.reverse());

    }


}



