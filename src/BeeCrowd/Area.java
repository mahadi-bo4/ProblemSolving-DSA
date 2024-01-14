package BeeCrowd;

import java.util.Scanner;

public class Area {

    public static void area(){
        Scanner sc = new Scanner(System.in);
        float a,b,c,triangle,traphi,rectananglr;

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        triangle = (a*c)/2;
        double circle = 3.14159*Math.pow(c,2);
        traphi = ((a+b)/2)*c;
        double squre = Math.pow(b,2);
        rectananglr = a*b;

        System.out.printf(
                        "TRIANGULO: %.3f%n" +
                        "CIRCULO: %.3f%n" +
                        "TRAPEZIO: %.3f%n" +
                        "QUADRADO: %.3f%n" +
                        "RETANGULO: %.3f%n", triangle, circle, traphi, squre, rectananglr
        );
    }
}
