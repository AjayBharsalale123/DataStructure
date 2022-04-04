package DataStructurePractice;

public class FindCubeRootBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 28;
		
		int sqrt = findCubeRoot(num);
		System.out.println(sqrt);
		
		//System.out.println(Math.sqrt(num));
	}

	private static int findCubeRoot(int num) {
		
		int start = 0;
		int end = num;
		
		int ans = 0;
		
		while(start<=end)
		{
			int mid = (start +end)/2;
			
			if(mid *mid * mid == num)
			{
				return mid;
			}
			
			//right
			else if (num >mid *mid * mid)
			{
				start = mid +1;
				ans = mid;
			}
			
			else
			{
				end = mid -1;
			}
		}
		
		return ans;
	}

}