import java.util.Scanner;

// count even and odd

public class  Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking array size
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // taking inputs for an array
        System.out.println("Write the input: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // output
        int[] counts = myfunction(arr);
        System.out.println(counts[0]);
        System.out.println(counts[1]);


    }

    static int[] myfunction(int arr[]){
        int even = 0;
        int odd = 0;
        for (int i=0; i< arr.length; i++){
           if (arr[i]%2==0){
               even++;
           }else {
               odd++;
           }
        }
        return new int[] {even,odd};
    }
}



