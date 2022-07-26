package leetcode.medium;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                result[i][j] = matrix[j][i];
        }

        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = m - 1;
            while (l < r) {
                int temp = result[i][l];
                result[i][l] = result[i][r];
                result[i][r] = temp;
                l++;
                r--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = result[i][j];
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        rotate(matrix2);
    }
}
