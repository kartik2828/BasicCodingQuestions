import java.sql.SQLOutput;
import java.util.Scanner;

class Demo{

    // reverseString

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();

        System.out.println(myuFunction(name1));

    }

    static Boolean myuFunction(String name){

        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.reverse();
        return sb.toString().equals(name);
    }
    }
