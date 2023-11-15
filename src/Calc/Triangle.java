package Calc;

public class Triangle {
    private double side1, side2, side3;
    private double height;
    private double base;

    public Triangle(double side1, double side2, double side3, double height, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
        this.base = base;
    }

    public double areaCalc(){
        return (this.base * this.height) / 2;
    }

    public double perimeterCalc(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        String txt = "\n" + Triangle.class.getSimpleName() + " info!\n";
        return String.format(txt + "Side 1: %.2f\nSide 2: %.2f\nSide 3: %.2f\nHeight: %.2f\nBase: %.2f\n\nArea: %.2f\nPerimeter: %.2f", this.side1, this.side2, this.side3, this.height, this.base, areaCalc(), perimeterCalc());
    }
}
