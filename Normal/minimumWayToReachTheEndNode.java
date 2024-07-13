package Normal;

public class minimumWayToReachTheEndNode {

    public static int findMinimumPath(int[][] matrix, int i, int j) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (i == m - 1 && j == n - 1) {
            return matrix[i][j];
        }
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }
        return matrix[i][j] + Math.min(findMinimumPath(matrix, i, j + 1), findMinimumPath(matrix, i + 1, j));
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 4, 7},
            {6, 8, 9}
        };
        int minimumPath = findMinimumPath(matrix, 0, 0);
        System.out.println("Minimum cost to reach the end node: " + minimumPath);
    }
}
