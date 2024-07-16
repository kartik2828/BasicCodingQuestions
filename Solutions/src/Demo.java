import java.util.Scanner;

// 10. Generate Fibonacci series (0,1,1,2,3,5...)

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        System.out.println("Series is: "+ t1 +","+ t2);


        for (int i=0; i<num; i++){
            int sum = t1 + t2;
            System.out.println(","+sum);
            t1 = t2;
            t2 =sum;

        }

    }
}



