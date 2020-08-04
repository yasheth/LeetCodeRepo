package medium;
public class NumOfDistinctIslands {

	static char [][]visited;
	static int nr,nc;
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) 
            return 0;

        nr = grid.length;
        nc = grid[0].length;
        visited = new char[nr][nc];   
        int num_islands = 0;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1' && visited[r][c] != 'X') {
                    num_islands++;
                    recursion(grid,r,c);
                }
            }
        }
        return num_islands;
    }

	private static void recursion(char[][] grid, int r, int c) {
		if(r<0 || c<0 || r>=nr || c>=nc || grid[r][c] == '0' || visited[r][c] =='X')
			return;
		visited[r][c]='X';
		recursion(grid,r-1,c);
		recursion(grid,r+1,c);
		recursion(grid,r,c-1);
		recursion(grid,r,c+1);
	}
		
	

	public static void main(String[] args) {
		System.out.println(numIslands(new char[][] {{'1','1','0','0','0'},{'0','0','1','0','1'}}));
	}

}
