package easy;

import java.util.Arrays;

public class ArrayDuplicate {

	public static boolean maxProfit(int[] nums) {
//		HashSet<Integer> set = new HashSet<Integer>();
//		 for(int i : nums)
//			 if(!set.add(i))
//				 return true; 
//		 return false;
		 Arrays.sort(nums);
	        for(int i = 1; i < nums.length; i++) {
	            if(nums[i] == nums[i - 1]) {
	                return true;
	            }
	        }
	        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {2,3,20,1,2}));
	}

}
