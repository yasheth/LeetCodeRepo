package easy;

public class FloodFill {

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if (image[sr][sc] == newColor)
			return image;
		fill(image, sr, sc, image[sr][sc], newColor);
		return image;
	}

	private static void fill(int[][] image, int sr, int sc, int color, int newColor) {
		if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color)
			return;
		image[sr][sc] = newColor;
		fill(image, sr + 1, sc, color, newColor);
		fill(image, sr - 1, sc, color, newColor);
		fill(image, sr, sc + 1, color, newColor);
		fill(image, sr, sc - 1, color, newColor);
	}

	public static void main(String[] args) {
		System.out.println(floodFill(new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 0, 0, 1 } }, 1, 1, 2));
	}

}
