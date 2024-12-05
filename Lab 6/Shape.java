public class Shape {
    float radius;

    public Shape() {
        radius = 1;
    }

    public void setRadius(float side) {
        this.radius = side;
    }

    public float getRadius() {
        return this.radius;
    }

    public float getDiameter() {
        return this.radius * 2;
    }

    public float getArea() {
        return radius * radius;
    }

    public float getVolume() {
        return radius * radius * radius;
    }

}
