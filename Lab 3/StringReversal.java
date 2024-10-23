public class StringReversal {
    public static void main(String[] args) {
        String string = "Foobar";
        String reversed = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.toUpperCase().charAt(i);
        }

        if (reversed.equals(string.toUpperCase())) {
            System.out.printf("%s is a palindrome", string);
        } else {
            System.out.printf("%s is not a palindrome", string);
        }
    }
}
