public class Recursion {

    // Question 1 - Print Backwards
    private static void printBackwards(String s, int index) {
        if (index >= 0) {
            System.out.print(s.charAt(index));
            printBackwards(s, index - 1);
        }
    }

    public static void printBackwards(String s) {
        printBackwards(s, s.length() - 1);
    }

    // Question 2 - Exponents
    static int exp(int n, int p) {
        if (p < 1) {
            return 1;
        }

        return n * exp(n, p - 1);

    }

    // Question 3 - rightIndexOF
    private static int rightIndexOf(String s, char ch, int index) {
        if (index < 0) {
            return -1;
        } else if (s.charAt(index) == ch) {
            return index;
        }

        return rightIndexOf(s, ch, index - 1);

    }

    public static int rightIndexOf(String s, char ch) {
        return rightIndexOf(s, ch, s.length() - 1);
    }

    // Question 4 - Sum
    private static int sum(int[] nums, int index) {
        if (index < 0) {
            return 0;
        }
        return nums[index] + sum(nums, index - 1);
    }

    public static int sum(int[] nums) {
        return sum(nums, nums.length - 1);
    }

    // Question 5 - Elfish
    private static int elfish(String s, char c, int index) {
        if (index < 0) {
            return 0;
        }

        if (s.charAt(index) == c) {
            return 1 + elfish(s, c, index - 1);
        } else {
            return elfish(s, c, index - 1);
        }
    }

    public static boolean elfish(String s) {
        int initIndex = s.length() - 1;

        if (elfish(s, 'e', initIndex) > 0 && elfish(s, 'l', initIndex) > 0 && elfish(s, 'f', initIndex) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "friendly";
        System.out.printf("Is the string \"%s\" elfish? %b", s, elfish(s));
    }

    public static String arrayString(int[] array) {
        String arrayString = "[";
        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                arrayString += array[i];
                break;
            }
            arrayString += array[i] + ", ";
        }
        return arrayString + "]";
    }

}
