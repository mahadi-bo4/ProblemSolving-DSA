package BeeCrowd;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;

        int input =  sc.nextInt();

        double sphereVolume = (4.0/3 * pi * Math.pow(input,3));
        System.out.printf("VOLUME = %.3f%n", sphereVolume);
    }
}
