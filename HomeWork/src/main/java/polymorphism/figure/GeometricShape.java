package polymorphism.figure;

public interface GeometricShape {

    static double calculateTotalArea(GeometricShape[] geometricShape) {
        double totalArea = 0;
        for (GeometricShape area : geometricShape) {
            totalArea = totalArea + area.getArea();
        }
        return totalArea;
    }

     double getArea();

}
