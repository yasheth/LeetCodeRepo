package medium;

import java.util.Arrays;

public class KClosestPointsToOrigin {

	public static int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
    return Arrays.copyOfRange(points, 0, K);
    }

	public static void main(String[] args) {
		System.out.println(kClosest(new int[][] {{1,0},{0,1},{3,1}},2));
	}

}
