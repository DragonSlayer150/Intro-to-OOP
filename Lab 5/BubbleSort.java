public class BubbleSort {
    public static void main(String[] args) {
        int[] unsorted = { 'A', 4, 'c', 3, 2 };
        System.out.print("Unsorted: ");
        printArray(unsorted);
        sort(unsorted);
        System.out.print("Sorted: ");
        printArray(unsorted);
    }

    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
