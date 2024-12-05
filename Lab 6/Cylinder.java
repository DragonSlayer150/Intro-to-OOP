public class Cylinder extends Shape {
    private float height;
    private final float PI = (float) Math.PI; // p = pi

    public Cylinder(float radius, float height) {
        super.radius = radius;
        this.height = height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return this.height;
    }

    @Override
    public float getArea() {
        return 2 * PI * this.radius * (this.radius + height); // A = 2pr(r+h)
    }

    @Override
    public float getVolume() {
        return ((float) Math.PI * this.radius * this.radius) * this.height; // V = phr^2
    }

    public void printCylinder() {
        System.out.println("Radius: " + this.getRadius());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Diameter: " + this.getDiameter());
        System.out.println("Area: " + this.getArea());
        System.out.println("Volume: " + this.getVolume());
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder(1, 1);

        System.out.println("Before Change: ");
        c.printCylinder();

        c.setRadius(10);
        c.setHeight(10);

        System.out.println("\nAfter Change:");
        c.printCylinder();
    }
}