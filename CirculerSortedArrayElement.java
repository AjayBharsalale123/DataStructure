package DataStructurePractice;

public class CirculerSortedArrayElement {

	public static void main(String[] args) {
		int[]a= {12,15,2,4,7,9};
		int k=7;
		
		
		searchedElement(a,k);

	}

	private static void searchedElement(int[] a, int k) {
		
		int start =0;
		int end = a.length-1;
		
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			int prev = (mid == 0)? a.length-1 : mid-1;
			
			int next = (mid == a.length-1)? 0: mid+1;
			
			
			if(a[mid]==k) {
				System.out.println("Found !");
				break;
			}
			
			else if(a[mid]>prev&&a[mid]<next) {
				
				start=mid+1;
			}
			else {
				end=mid-1;
				
			}
		}
		System.out.println("Not Found !");
		
		
	}

}
