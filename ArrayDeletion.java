package DataStructurePractice;
import java.util.Scanner;


public class ArrayDeletion {
	
	public static void main(String args[]) {
		
		int m,n,p;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element of array :");
		n=sc.nextInt();
		
		int []a=new int[n];
		int []b=new int [n-1];
		
		System.out.println("Enter Element of an array ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Entered index value to be deleted :");
		m=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(i<m) {
				b[i]=a[i];
			}
			else if(i==m)
				continue;
			
			else {
				b[i-1]=a[i];
			}
		}
		
		System.out.println("Elements are :");
		
		for(int i=0;i<a.length-1;i++) {
			System.out.println(b[i]);
			
		}
		
		
	}

}
