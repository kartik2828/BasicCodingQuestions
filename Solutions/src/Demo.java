import java.util.ArrayList;
import java.util.Scanner;

// even odd array

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the array size
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // enter the array element
        System.out.println("Enter the array element: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // output
        ArrayList<Integer> result[] = myFunction(arr);
        System.out.println("odd: " + result[1]);
        System.out.println("Even: "+ result[0]);
    }

    static ArrayList<Integer>[] myFunction(int[] arr1){
        ArrayList<Integer> even  = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int n:arr1){
            if (n%2==0){
                even.add(n);
            }else {
                odd.add(n);
            }
        }
        return  new ArrayList[]{even,odd};
    }
}



