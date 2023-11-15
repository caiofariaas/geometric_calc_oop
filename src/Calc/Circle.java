package Calc;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaCalc(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double perimeterCalc(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        String txt = "\n" + Circle.class.getSimpleName() + " info!\n";
        return String.format(txt + "Radius: %.2f\nArea: %.2f\nPerimeter: %.2f", this.radius, areaCalc(), perimeterCalc());
    }
}
