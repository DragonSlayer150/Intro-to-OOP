public class ArrayReversal {
    public static void main(String[] args) {
        int[] original = { 1, 2 };
        int[] reversed = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        System.out.print("Original: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.print("\nReversed: ");

        for (int num : reversed) {
            System.out.print(num + " ");
        }

    }
}
