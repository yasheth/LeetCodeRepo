package medium;

public class ArrayProductExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
//		int length = nums.length;
//		int[] L = new int[length];
//		int[] R = new int[length];
//		int[] answer = new int[length];
//
//		// L[i] contains the product of all the elements to the left
//		L[0] = 1;
//		for (int i = 1; i < length; i++) {
//			L[i] = nums[i - 1] * L[i - 1];
//		}
//
//		// R[i] contains the product of all the elements to the right
//		R[length - 1] = 1;
//		for (int i = length - 2; i >= 0; i--) {
//			R[i] = nums[i + 1] * R[i + 1];
//		}
//
//		// Constructing the answer array
//		for (int i = 0; i < length; i++) {
//			answer[i] = L[i] * R[i];
//		}
//		return answer;
		// from discuss
		int n = nums.length;
	    int[] res = new int[n];
	    res[0] = 1;
	    for (int i = 1; i < n; i++) {
	        res[i] = res[i - 1] * nums[i - 1];
	    }
	    int right = 1;
	    for (int i = n - 1; i >= 0; i--) {
	        res[i] *= right;
	        right *= nums[i];
	    }
	    return res;
	}
	
	public static void main(String[] args) {
		System.out.println(productExceptSelf(new int[] { 2, 3, 20, 1 }));
	}

}
