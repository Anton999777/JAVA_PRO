package polymorphism.figure;

public class Main {
    public static void main(String[] args) {
        GeometricShape circle = new Circle(6);
        GeometricShape square = new Square(5);
        GeometricShape triangle = new Triangle(3, 4, 5);


        GeometricShape[] geometricShapes2 = {circle, square, triangle};
        System.out.println(GeometricShape.calculateTotalArea(geometricShapes2));
    }
}
