public class Circle {
    float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float getDiameter() {
        return this.radius * 2;
    }

    public float getArea() {
        return (float) Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        c1.setRadius(1.0f);
        c3.setRadius(4.5f);
        Circle[] circles = { c1, c2, c3 };

        for (int i = 0; i < 3; i++) {
            float rad, diam, area;
            Circle c = circles[i];
            rad = c.getRadius();
            diam = c.getDiameter();
            area = c.getArea();
            System.out.println("circle " + i + " has a radius of: " + rad + ", a diameter of: " + diam
                    + ", and an area of: " + area);
        }

        System.out.println("changing the radii of the circles…");

        circles[1].setRadius(0.5f);
        circles[2].setRadius(9.0f);

        for (int i = 0; i < 3; i++) {
            float rad, diam, area;
            Circle c = circles[i];
            rad = c.getRadius();
            diam = c.getDiameter();
            area = c.getArea();
            System.out.println("Now circle " + i + " has a radius of: " + rad + ", a diameter of: " + diam
                    + ", and an area of: " + area);
        }
    }
}
