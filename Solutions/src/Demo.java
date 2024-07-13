import java.sql.SQLOutput;
import java.util.Scanner;

class Demo{

    // palindrome Number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println(myuFunction(num1));

    }

    static Boolean myuFunction(int num){
        int originalNumber = num;
        int rev = 0;
        while (num!=0){
           rev  = rev*10 + num%10;
           num = num/10;
        }
        return rev == originalNumber;
    }
    }
