package medium;

public class Matrix01 {

	public static int[][] updateMatrix(int[][] matrix) {
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;
        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= cols; j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] = Integer.MAX_VALUE;
                    if(i-1 >= 0 && matrix[i-1][j] != Integer.MAX_VALUE)
                        matrix[i][j] = Math.min(matrix[i][j],matrix[i-1][j]+1);
                    if(j-1 >= 0 && matrix[i][j-1] != Integer.MAX_VALUE)
                        matrix[i][j] = Math.min(matrix[i][j],matrix[i][j-1]+1);
                }
            }
        }
        for(int i = rows; i >= 0; i--){
            for(int j = cols; j >= 0; j--){
                if(i+1 <= rows && matrix[i+1][j] != Integer.MAX_VALUE)
                    matrix[i][j] = Math.min(matrix[i][j],matrix[i+1][j]+1);
                if(j+1 <= cols && matrix[i][j+1] != Integer.MAX_VALUE)
                    matrix[i][j] = Math.min(matrix[i][j],matrix[i][j+1]+1);               
            }
        }
        return matrix;
    }	

	public static void main(String[] args) {
		System.out.println(updateMatrix(new int[][] {{1,1,0,0,0},{1,1,0,0,0}}));
	}

}
