public class Cylinder extends Circle {
    private float height;
    private final float PI = (float) Math.PI; // p = pi

    public Cylinder(float radius, float height) {
        super(radius);
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
        return 2 * PI * super.getRadius() * (super.getRadius() + height); // A = 2pr(r+h)
    }

    public float getVolume() {
        return super.getArea() * this.height; // V = phr^2
    }

    public void printCylinder() {
        System.out.println("Radius: " + this.getRadius());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Diameter: " + this.getDiameter());
        System.out.println("Area: " + this.getArea());
        System.out.println("Volume: " + this.getVolume());
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder(5, 5);

        System.out.println("Before Change: ");
        c.printCylinder();

        c.setRadius(10);
        c.setHeight(10);

        System.out.println("\nAfter Change:");
        c.printCylinder();
    }
}