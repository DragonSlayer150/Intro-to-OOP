public class Circle extends Shape {

    public Circle(float radius) {
        super.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * this.radius * this.radius;
    }
}
