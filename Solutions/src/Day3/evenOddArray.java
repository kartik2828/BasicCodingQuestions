package Day3;

public class evenOddArray {
// check the even and odd from an array

    public static void evenOdd(int arr[]){

        StringBuilder oddNumbers = new StringBuilder("odd numbers: ");
        StringBuilder evenNumbers = new StringBuilder("even Numbers: ");
        for(int num:arr){
            if(num%2==0){
                oddNumbers.append(num).append(",");
            }else {
                evenNumbers.append(num).append(",");
            }
        }
        // set length
        oddNumbers.setLength(oddNumbers.length()-1);
        evenNumbers.setLength(evenNumbers.length()-1);

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
    public static void main(String[] args) {
        int[]  arr1 = {1,2,3,4,5,6,7};
        evenOdd(arr1);
    }
}
