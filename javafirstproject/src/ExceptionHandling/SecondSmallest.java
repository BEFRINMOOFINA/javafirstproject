package ExceptionHandling;
import java.util.*;
public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = {12, 3, 45, 23, 56};
        Arrays.sort(arr);
        System.out.println("Sorted array:"+ Arrays.toString(arr));
        int secondSmallest = arr[1];
        int secondLargest = arr[arr.length - 2];
        System.out.println("Second smallest number:"+ secondSmallest);
        System.out.println("Second largest number: "+ secondLargest);
	}
}