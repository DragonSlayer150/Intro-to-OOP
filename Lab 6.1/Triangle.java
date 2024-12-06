public class Triangle extends Polygon {

    public Triangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == j) {
                    System.out.print("\\");
                } else if (i == height - 1) {
                    System.out.print("_");
                } else if (j == 0) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
