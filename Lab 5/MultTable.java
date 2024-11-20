public class MultTable {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int[][] multTable = new int[n + 1][m + 1];

        for (int i = 0; i <= m; i++) {
            multTable[0][i] = i;
        }
        for (int j = 0; j <= n; j++) {
            multTable[j][0] = j;
        }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                multTable[row][col] = row * col;
            }
        }

        for (int[] array : multTable) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
