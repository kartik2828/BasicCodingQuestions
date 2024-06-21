package Day3;

public class arraySum {

    // find the sum of elements of an array

    public static int checkarraySum (int[] arr){
        int sum = 0;
        for (int num:arr){
            sum = sum + num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,8};
        System.out.println(checkarraySum(arr1));
    }
}
