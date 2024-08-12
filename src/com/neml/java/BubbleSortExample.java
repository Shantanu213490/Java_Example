package com.neml.java;

public class BubbleSortExample {

	public static void main(String[] args) {
		
		int[] num = {4,9,2,5,6,1,3};
		int[] result = GetSortedArr.bubbleSort(num);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+ " ");
		}

	}

}
class GetSortedArr{
	
	public static int[] bubbleSort(int[] num) {
		
		int temp=0;
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j] > num[j+1]) {
					
					temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;	
	}
}