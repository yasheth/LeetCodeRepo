package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NumOfIslands {

	static int[][] grid;
    static boolean[][] seen;
    static ArrayList<Integer> shape;

    public static void explore(int r, int c, int di) {
        if (0 <= r && r < grid.length && 0 <= c && c < grid[0].length &&
                grid[r][c] == 1 && !seen[r][c]) {
            seen[r][c] = true;
            shape.add(di);
            explore(r+1, c, 1);
            explore(r-1, c, 2);
            explore(r, c+1, 3);
            explore(r, c-1, 4);
            shape.add(0);
        }
    }
    public static int numDistinctIslands(int[][] grid) {
        NumOfIslands.grid = grid;
        seen = new boolean[grid.length][grid[0].length];
        Set shapes = new HashSet<ArrayList<Integer>>();

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                shape = new ArrayList<Integer>();
                explore(r, c, 0);
                if (!shape.isEmpty()) {
                    shapes.add(shape);
                }
            }
        }

        return shapes.size();
    }

		
	

	public static void main(String[] args) {
		System.out.println(numDistinctIslands(new int[][] {{1,1,0,0,0},{1,1,0,0,0}}));
	}

}
