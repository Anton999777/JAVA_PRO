package polymorphism.figure;

public class Triangle extends Figure implements GeometricShape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double S_Triangle;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getS_Triangle() {
        return S_Triangle;
    }

    public void setS_Triangle(double s_Triangle) {
        S_Triangle = s_Triangle;
    }

    @Override
    public double areaFigure() {
        S_Triangle = sideA + sideB + sideC;
        return S_Triangle;
    }

}
