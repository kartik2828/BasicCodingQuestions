import java.util.Scanner;

class Demo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Demo obj = new Demo();

        System.out.println(obj.demo1(n));
    }

    boolean demo1(int num){
        int rev  = 0;
        int originalNumber = num;

        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev == originalNumber;
    }
}