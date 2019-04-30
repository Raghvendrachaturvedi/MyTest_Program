import java.util.Arrays;

public class LargestSmallestinArray {

	public static void main(String[] args) {
		
		int [] arr = {23,56,45,12,-45};
		
//		for(int i=0;i<arr.length;i++) {
//			
//			System.out.println(arr[i]);
//		}
		
		int largest = arr[0];
		int smallest = arr[0];
		
		System.out.println(arr[0]);
		System.out.println(arr[0]);
		
		for (int i=0;i<arr.length;i++) {
			
		if(arr[i]>largest) {
			
			largest=arr[i];
		}else 
			
			smallest = arr[i];
		}
		
		
		System.out.println("Given Array is"+ Arrays.toString(arr));
		
		System.out.println("Largest Number in array is" +largest);
		
		System.out.println("Smalletst Number in Array is"+ smallest);
		
		
		
	}

}
