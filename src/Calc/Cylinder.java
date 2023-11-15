package Calc;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volumeCalc(){
        return  Math.PI * Math.pow(this.radius, 2);
    }

    public double areaCalc(){
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }
}
