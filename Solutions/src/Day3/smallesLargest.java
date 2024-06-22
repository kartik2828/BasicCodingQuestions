package Day3;

public class smallesLargest {

    // Find the smallest and largest in an array

public static void checkNumber(int[] arr){
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    for (int i =0; i<arr.length;  i++){

        if (arr[i]<smallest){
            smallest = arr[i];
        }

        if (arr[i]>largest){
            largest = arr[i];
        }
    }
    System.out.println("Smalles number is: "+ smallest);
    System.out.println("Largest number is: "+ largest);
}

public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5,6};
    checkNumber(arr1);
}
}
