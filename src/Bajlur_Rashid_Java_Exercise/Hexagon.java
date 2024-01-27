package Bajlur_Rashid_Java_Exercise;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the hexagon side: ");
        double s = scan.nextDouble();
        double areaOfHexagon = 6 * Math.pow(s,2) / 4 * Math.tan(3.1416/6) ;
        System.out.println("Area of Hexagon is: " + areaOfHexagon);

    }
}
