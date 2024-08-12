package com.neml.gfgjava;

public class Rotation {

	public static void main(String[] args) {
		
		int n = 5;
		int[] arr = {5, 1, 2, 3, 4};
		int result = GetRotation.findKRotation(arr, n);
		System.out.println(result);
	}

}
class GetRotation {
   public static int findKRotation(int arr[], int n) {
	   
	   int count = 0;
	   
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<n-i-1;j++) {
			   if(arr[j]>arr[j+1]) {
				   count++;
			   }
		   }
	   }
		return count;
        
    }
}