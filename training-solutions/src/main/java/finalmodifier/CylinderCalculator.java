package finalmodifier;

public class CylinderCalculator {

    public double calculateVolume(double r, double h) {
        return h * r * r * CircleCalculator.PI;
    }

    public double calculateSurfaceArea(double r, double h) {
        return 2 * r * CircleCalculator.PI * h + 2 * r * r * CircleCalculator.PI;
    }
}
