package Calc;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double areaCalc(){
        return Math.pow(this.side, 2);
    }

    public double perimeterCalc(){
        return this.side * 4;
    }

    @Override
    public String toString() {
        String txt = "\n" + Square.class.getSimpleName() + " info!\n";
        return String.format(txt + "Side: %.2f\nArea: %.2f\nPerimeter: %.2f", this.side,areaCalc(), perimeterCalc());
    }
}
