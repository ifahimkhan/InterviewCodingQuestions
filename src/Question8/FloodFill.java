package Question8;


public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;

        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image; // No need to perform flood fill if the new color is the same as the old color
        }

        dfs(image, sr, sc, m, n, oldColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int m, int n, int oldColor, int newColor) {
        if (row < 0 || row >= m || col < 0 || col >= n || image[row][col] != oldColor) {
            return;
        }

        image[row][col] = newColor;

        dfs(image, row - 1, col, m, n, oldColor, newColor); // Up
        dfs(image, row + 1, col, m, n, oldColor, newColor); // Down
        dfs(image, row, col - 1, m, n, oldColor, newColor); // Left
        dfs(image, row, col + 1, m, n, oldColor, newColor); // Right
    }

    public static void main(String[] args) {
        // Example usage
        FloodFill solution = new FloodFill();

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        int[][] modifiedImage = solution.floodFill(image, sr, sc, newColor);

        System.out.println("Modified image:");
        for (int[] row : modifiedImage) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
