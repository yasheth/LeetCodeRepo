package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbers {

	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(twoSum(new int[] {1,3,20,2},23));
	}

}
