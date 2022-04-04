package DataStructurePractice;

import java.util.Scanner;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		
		

		int a[] = {2,5,7,8,12,34,56,78,90};
		int s = 99;
		
		int searchIndex = binarySearch(a,s);
		System.out.println(searchIndex);
	}

	private static int binarySearch(int[] a, int s) {
		
		int start = 0;
		int end = a.length -1;
		
		
		while(start<=end)
		{
			int mid = (start + end)/2;
			
			if(a[mid] == s)
			{
				return mid;
			}
			
			
			// search right of mid
			if(s > a[mid])
			{
				start = mid +1;
			}
			
			// search left of mid
			else if( s < a[mid])
			{
				end = mid - 1;
			}
		}
		return -1;
		   
		
	}

}
