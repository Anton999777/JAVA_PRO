package polymorphism.figure;

public class Circle implements GeometricShape {
    static final double constantP = 3.14;
    private double radius;
    private double diameterCircle;
    private double S_Circle;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameterCircle() {
        return diameterCircle;
    }

    public double getS_Circle() {
        return S_Circle;
    }

    @Override
    public double areaFigure() {
        diameterCircle = this.radius * this.radius;
        S_Circle = diameterCircle / 4 * constantP;
        return S_Circle;
    }

}


