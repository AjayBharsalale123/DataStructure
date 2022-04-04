package DataStructurePractice;

public class ArrayLinearSearch {
	
	public static void main(String []args) {
	
		int []a={1,2,3,4,5,6};
		
		int k=9;
		
		System.out.println(linearSearchElement(a,k));
	}

	private static int  linearSearchElement(int[] a, int k) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				System.out.println("Found  at "+i+"th Element");
				
			}
			
		}
		return -1;
		
			
		
	}

}
