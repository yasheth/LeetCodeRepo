package medium;


public class MaximumProductSubarray {

	public static int maxProduct(int[] nums) {
//		if (nums.length == 0) return 0;
//
//        int max_so_far = nums[0];
//        int min_so_far = nums[0];
//        int result = max_so_far;
//
//        for (int i = 1; i < nums.length; i++) {
//            int curr = nums[i];
//            int temp_max = Math.max(curr, Math.max(max_so_far * curr, min_so_far * curr));
//            min_so_far = Math.min(curr, Math.min(max_so_far * curr, min_so_far * curr));
//
//            max_so_far = temp_max;
//
//            result = Math.max(max_so_far, result);
//        }
//
//        return result;
		 int r = nums[0];
	        int imax = r; 
	        int imin = r;
	        for (int i = 1 ; i < nums.length; i++) {
	            // multiplied by a negative makes big number smaller, small number bigger
	            // so we redefine the extremums by swapping them
	            if (nums[i] < 0){
	                int temp = imin;
	                imin = imax;
	                imax = temp;
	            }
	            // max/min product for the current number is either the current number itself
	            // or the max/min by the previous number times the current one
	            imax = Math.max(nums[i], imax * nums[i]);
	            imin = Math.min(nums[i], imin * nums[i]);

	            // the newly computed max value is a candidate for our global result
	            r = Math.max(r, imax);
	        }
	            return r;
	}

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] {2,3,-2,4}));
	}

}
