package leetcode.medium;

public class RangeSumQuery2DImmutable {

    private int[][] matrix;

    public RangeSumQuery2DImmutable(int[][] matrix) {
        this.matrix = matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        RangeSumQuery2DImmutable obj = new RangeSumQuery2DImmutable(matrix);
        int a = obj.sumRegion(2, 1, 4, 3);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i=0; i < matrix.length; i++) {
            if (i < row1){
                continue;
            }
            if (i > row2) {
                break;
            }
            for (int j=col1;j <= col2; j++) {
                sum+= matrix[i][j];
            }
        }
        return sum;
    }
}
