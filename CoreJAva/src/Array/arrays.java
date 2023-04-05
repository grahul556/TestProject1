package Array;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		int intArr[]= {10,2,30,999,88};
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		int key=5;
		System.out.println("The Key Present at index "+ Arrays.binarySearch(intArr, key));
		
		int[] intArr1= {10,2,30,77};
		
		System.out.println(Arrays.toString(intArr1));
		
		//compair
		if(Arrays.compare(intArr, intArr1)==0) {
			System.out.println("Both the arrays are equal");
			
		}
		else{
			System.out.println("Both the arrays are not equal");
		}
		
		
	  //copy array	
		
		
		int intArr2[]=Arrays.copyOf(intArr, 10);
		System.out.println(Arrays.toString(intArr2));
		
		
		int intArr3[]=Arrays.copyOfRange(intArr, 2,4);
		System.out.println(Arrays.toString(intArr3));
		
		
		//Arrys fill
		
		Arrays.fill(intArr3,55);
		System.out.println(Arrays.toString(intArr3));
	}

}
