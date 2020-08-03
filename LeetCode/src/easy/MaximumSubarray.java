package easy;


public class MaximumSubarray {

	public static int maxSubArray(int[] nums) {
		int n = nums.length;
        if(n == 0)
            return 0;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < n; i++){
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
//        int sum = 0,maxSum = Integer.MIN_VALUE;
//        for(int i = 0; i < nums.length; i++){
//            if(sum < 0){
//                sum = nums[i];
//            }else{
//                sum = sum + nums[i];
//            }
//            if(sum > maxSum)
//                maxSum = sum;  
//        }
//        return maxSum;
	}

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { 2, 3, 20, 1, 2 }));
	}

}
