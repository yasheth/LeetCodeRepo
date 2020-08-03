package easy;

public class TwoSum2 {

	public static int[] twoSum(int[] numbers, int target) {
		 int l = 0; int r = numbers.length - 1;
	        while(numbers[l] + numbers[r] != target){
	            if(numbers[l] + numbers[r] > target)
	                r--;
	            else
	                l++;
	        }
	        return new int[]{l+1,r+1};
	}

	public static void main(String[] args) {
		System.out.println(twoSum(new int[] { 2, 3, 4, 5, 6 },5));
	}

}
