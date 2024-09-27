public class Operations {

    public static void main(String[] args) {

        int x, y, z;
        x = 5;
        y = 8;

        z = x + y; // z gets x plus y to make the statement correct
        System.out.println("a) " + x + " plus " + y + " is " + z);

        z = y - x; // = ?
        System.out.println("b) " + y + " minus " + x + " is " + z);

        z = y / x; // = ?
        System.out.println("c) " + y + " divided by " + x + " is " + z);

        z = 2 * (x + y); // = ?
        System.out.println("d) twice the result of " + x + " plus " + y + " is " + z);

        z = (x * y) / 2; // = ?
        System.out.println("e) half the result of " + x + " multiplied by " + y + " is " + z);

        z = y % x; // = ?
        System.out.println("f) the remainder of " + y + " divided by " + x + " is " + z);

        z = x << 2; // = ?
        System.out.println("g) the result of " + x + " left bit shifted by " + 2 + " is " + z);

        z = x & y; // = ?
        System.out.println("h) the result of " + x + " bitwise and " + y + " is " + z);

    }

}