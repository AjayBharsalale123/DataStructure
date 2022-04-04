package DataStructurePractice;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
			
		int m,n,p;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element of array :");
		n=sc.nextInt();
		
		int []a=new int[n];
		int []b=new int [n+1];
		
		System.out.println("Enter Element of an array ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Entered index value to be Inserted :");
		m=sc.nextInt();
		System.out.println("Enter the value to be inseted");
		p=sc.nextInt();
		
		for(int i=0;i<n+1;i++) {
			if(i<m) {
				b[i]=a[i];
			}
			else if(i==m)
				b[i]=p;
			
			else {
				b[i]=a[i-1];
			}
		}
		
		System.out.println("Elements are :");
		
		for(int i=0;i<a.length+1;i++) {
			System.out.println(b[i]);

	}

	}
}
