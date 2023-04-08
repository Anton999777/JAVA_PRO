package polymorphism.figure;

public class Triangle implements GeometricShape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double areaTriangle;

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

    public double getAreaTriangle() {
        return areaTriangle;
    }

    public void setAreaTriangle(double areaTriangle) {
        this.areaTriangle = areaTriangle;
    }

    @Override
    public double getArea() {
        return sideA + sideB + sideC;
    }

}
