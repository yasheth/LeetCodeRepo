package easy;

public class RunningSum1DA {

	static public int[] runningSum(int[] nums) {
		int sum[] = new int[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum[i] = sum[i - 1] + nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int nums[] = new int[] {1,2,3,4,5};
		int sum[] = runningSum(nums);
		for (int i = 0; i < sum.length; i++) 
	         System.out.print(" "+ sum[i]); 
	}

}
