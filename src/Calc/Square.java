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
}
