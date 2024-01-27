package Bajlur_Rashid_Java_Exercise;

import java.util.Scanner;


// Calculation of the difference between two points.


public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter X1: ");
        double x1 = sc.nextDouble();
        System.out.print("Please enter Y1: ");
        double y1 = sc.nextDouble();
        System.out.println("(X1,Y1)= "+ x1 +","+y1);


        System.out.print("Please enter X2: ");
        double x2 = sc.nextDouble();
        System.out.print("Please enter Y2: ");
        double y2 = sc.nextDouble();
        System.out.println("(X2,Y2)= "+ x2 +","+y2);

        double d = Math.sqrt(Math.pow((x2 - x1),2)+ Math.pow((y2 - y1),2));
        System.out.println("Distance between two points are: " + d);
    }
}
