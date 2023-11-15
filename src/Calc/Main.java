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
                while (true){
                    try {
                        System.out.print("What's the radius of the circle?: ");
                        radius = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }

                Circle circle = new Circle(radius);

                System.out.println(circle);
                return;

            case 2:
                while (true){
                    try {
                        System.out.print("What's the radius of the cylinder?: ");
                        radius = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }
                while (true){
                    try {
                        System.out.print("What's the height of the cylinder?: ");
                        height = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }

                Cylinder cylinder = new Cylinder(radius, height);

                System.out.println(cylinder);
                return;

            case 3:
                while (true){
                    try {
                        System.out.print("What's the side measurement of the square?: ");
                        side1 = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }

                Square square = new Square(side1);

                System.out.println(square);
                return;

            case 4:
                while (true){
                    try {
                        System.out.print("What's the side 1 measurement of the triangle?: ");
                        side1 = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }
                while (true){
                    try {
                        System.out.print("What's the side 2 measurement of the triangle?: ");
                        side2 = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }
                while (true){
                    try {
                        System.out.print("What's the side 3 measurement of the triangle?: ");
                        side3 = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }
                while (true){
                    try {
                        System.out.print("What's the height of the triangle?: ");
                        height = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }
                while (true){
                    try {
                        System.out.print("What's the base of the triangle?: ");
                        base = sc.nextDouble();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("\ninvalid input!\n");
                        sc.next();
                    }
                }

                Triangle triangle = new Triangle(side1, side2, side3, height, base);

                System.out.println(triangle);

                return;

            default:
                System.out.println("\ninvalid input!\n");
        }
    }
}