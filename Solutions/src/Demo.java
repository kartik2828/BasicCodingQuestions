import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;
// Pallindrome String

public class  Demo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println(myFunction(name1));
    }

    static boolean myFunction(String name){
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.reverse();

                return sb.toString().equals(name);

    }
}



