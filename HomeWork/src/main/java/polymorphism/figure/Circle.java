package polymorphism.figure;

public class Circle implements GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        double diameterCircle = this.radius * this.radius;
        return diameterCircle / 4 * Math.PI;
    }

}


