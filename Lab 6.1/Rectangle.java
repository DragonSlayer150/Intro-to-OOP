public class Rectangle extends Polygon {

    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print("_");
                } else if (j == 0 || j == width - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 6);
        rect1.draw();
        // System.out.println();
        // Triangle tri1 = new Triangle(5, 5);
        // tri1.draw();
    }
}
