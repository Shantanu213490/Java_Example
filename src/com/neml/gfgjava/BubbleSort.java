package com.neml.gfgjava;

public class BubbleSort {

	public static void main(String[] args) {
		
		int n = 5,arr[] = {4, 1, 3, 9, 7};
		GetSortedArray.bubbleSort(arr, n);

	}

}
class GetSortedArray
{

	public static void bubbleSort(int arr[], int n)
    {
       int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
    }
}