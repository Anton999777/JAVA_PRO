package polymorphism.figure;

public class Square extends Figure implements GeometricShape {

    private double sideLength;
    private double S_Square;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getS_Square() {
        return S_Square;
    }

    @Override
    public double areaFigure() {
        S_Square = sideLength * 4;
        return S_Square;
    }

}
