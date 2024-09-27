public class Comparisons {

    public static void main(String[] args) {
        int a, b;
        boolean c;
        a = 3;
        b = 4;
        c = a < b; // c gets the value of a < b to make the statement correct
        System.out.println("1) " + a + " less than " + b + " is " + c);

        c = a > b; // c = ?
        System.out.println("2) " + a + " greater than " + b + " is " + c);

        c = b >= a; // c = ?
        System.out.println("3) " + b + " greater than or equal to " + a + " is " + c);

        c = b != a; // c = ?
        System.out.println("4) " + b + " not equal to " + a + " is " + c);

        a = 5; // a = ?
        System.out.println("5) " + b + " less than " + a + " is " + true);

        b = 6; // b = ?
        System.out.println("6) " + a + " less than or equal to " + b + " is " + true);

        a = 6; // a = ?
        System.out.println("7) " + a + " equals " + b + " is " + true);

        int myVar = 5;
        System.out.println(myVar++);

    }

}
