package DataStructurePractice;


public class FindSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;

		int sqrt = findSqrt(num);
	}

	private static int findSqrt(int num) {

		for (int i = 1; i < num/2; i++) {
			
			if (i * i == num) {
				System.out.println(i);
				
			}
		}

		return -1;

	}
	

}