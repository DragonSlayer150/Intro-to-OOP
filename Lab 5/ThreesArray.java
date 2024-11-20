public class ThreesArray {
    public static void main(String[] args) {
        int[] threes = new int[33];

        threes[0] = 0;
        for (int i = 1; i <= threes.length; i++) {
            threes[i - 1] = i * 3;
        }

        for (int num : threes) {
            System.out.print(num + " ");
        }
    }
}
