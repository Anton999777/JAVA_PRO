package polymorphism.figure;

public class Square implements GeometricShape {

    private double sideLength;


    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * 4;
    }

}
