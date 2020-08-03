package easy;

import java.util.HashSet;

public class MissingNumber {

	public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n:nums)
            set.add(n);
        
        int exp = nums.length+1;
        for(int i = 0; i < exp; i++){
            if(!set.contains(i))
                return i;
        }
        return -1;
        
    }

	public static void main(String[] args) {
		 System.out.print(missingNumber(new int[] {0,1,2,4,5})); 
	}

}
