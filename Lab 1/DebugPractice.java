public class DebugPractice {

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z;

        x = x + 4; // a)
        y *= 2; // b)
        z = y % (x--); // c)

        System.out.println("its working" + z);
    }

}
