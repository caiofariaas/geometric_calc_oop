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

    @Override
    public String toString() {
        String txt = "\n" + Cylinder.class.getSimpleName() + " info!\n";
        return String.format(txt + "Radius: %.2f\nHeight: %.2f\nArea: %.2f\nVolume: %.2f", this.radius, this.height ,areaCalc(), volumeCalc());
    }
}
