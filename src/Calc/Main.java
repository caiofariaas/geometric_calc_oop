package Calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double side1, side2, side3, base, height, radius;
        String name;
        int figure;

        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("-------Welcome to your geometric calculator!-------");
        System.out.println("---------------------------------------------------");
        System.out.print("  What's your name?:  ");
        name = sc.nextLine();

        while (true){
            try{
                System.out.printf("\n%s, choose a figure!\n", name);
                System.out.print("1 <- Circle\n2 <- Cylinder\n3 <- Square\n4 <- Triangle\nAnswer: ");
                figure= sc.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("\ninvalid input!");
                sc.next();
            }
        }
        switch (figure){
            case 1:
                System.out.print("What is the radius of the circle?: ");
                radius = sc.nextDouble();
                Circle circle = new Circle(radius);

                System.out.println(circle);

            case 2:
                System.out.print("What is the radius of the cylinder?: ");
                radius = sc.nextDouble();
                System.out.print("What is the height of the cylinder?: ");
                height = sc.nextDouble();
                Cylinder cylinder = new Cylinder(radius, height);

                System.out.println(cylinder);
        }
    }
}