package medium;


public class Search2DMatrix2 {

	 public static boolean searchMatrix(int[][] matrix, int target) {
	        if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
	            return false;
	        int row = 0;
	        int col = matrix[0].length - 1;
	        while(col >= 0 && row < matrix.length){
	            if(target == matrix[row][col])
	                return true;
	            else if(matrix[row][col] > target)
	                col--;
	            else
	                row++;
	        }
	        return false;
	    }	

	public static void main(String[] args) {
		System.out.println(searchMatrix(new int[][] {{1,2,3,4,5},{2,3,4,5,6}}, 6));
	}

}
