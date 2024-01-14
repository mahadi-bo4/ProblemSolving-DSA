package BeeCrowd;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        float oilConsumped = sc.nextFloat();

        double consumption = km/oilConsumped;
        System.out.printf("%.3f km/l", consumption);
    }
}
