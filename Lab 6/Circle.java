
public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getRadius() {
        return this.radius;
    }

    @Override
    public float getDiameter() {
        return this.radius * 2;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * this.radius * this.radius;
    }
}
