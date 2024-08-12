package com.neml.gfgjava;

public class EquilibriumPoint {

	public static void main(String[] args) {
		
		int n = 5;
		long arr[] = {1, 3, 5, 2, 2,};
		int result = GetEquilPoint.equilibriumPoint(arr, n);
		System.out.println(result);
	}

}
class GetEquilPoint {
	
    public static int equilibriumPoint(long arr[], int n) {
    	
    	int totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }
//        System.out.println(totalSum);
        
        // Initialize prefix sum
        int prefixSum = 0;
        
        // Iterate through the array to find equilibrium point
        for (int i = 0; i < n; i++) {
            // Check if prefix sum equals total sum minus current element (suffix sum)
            if (prefixSum == totalSum - arr[i]) {
                // Return the index of equilibrium point (1-based index)
//            	System.out.println(i);
                return i-1;
            }
            // Update prefix sum for next iteration
            prefixSum += arr[i];
        }
        
        // No equilibrium point found
        return -1;

    }
}