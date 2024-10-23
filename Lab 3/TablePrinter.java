public class TablePrinter {
    public static void main(String[] args) {
        int m = 5;
        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
