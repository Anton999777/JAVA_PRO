package polymorphism.figure;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Square square = new Square(5);
        Triangle triangle = new Triangle(3, 4, 5);

        Figure figure = new Figure();
        GeometricShape[] geometricShapes2 = {circle, square, triangle};

        System.out.println(figure.allSumAreaFigure(geometricShapes2));
    }

}
