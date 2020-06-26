package medium;

public class MostWaterContainer {

	public static int maxArea(int[] height) {
		int l = 0;
		int r = height.length - 1;
		int max_area = 0;
		while (l < r) {
			max_area = Math.max(max_area, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		return max_area;
	}

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 5, 6, 7, 1, 23, 5 }));
	}

}
