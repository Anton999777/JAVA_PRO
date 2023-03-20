package polymorphism.figure;

public class Figure {
    double sum = 0;

    double allSumAreaFigure(GeometricShape[] geometricShape) {
        for (int i = 0; i < geometricShape.length; i++) {
            sum = sum + geometricShape[i].areaFigure();
        }
        return sum;
    }
}
