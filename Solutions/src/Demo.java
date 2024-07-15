import java.util.Scanner;
// reverse a number

public class  Demo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(myFunction(num1 , num2));

    }

    static String myFunction(int num1, int num2){

        int temp  =  num1;
        num1 = num2;
        num2 = temp;

        return num1 + "," + num2 ;

    }
}



