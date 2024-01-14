package BeeCrowd;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int code,quantity;
            float price, totalAmount =0;

            for(int i = 0; i<2; i++){
                code = scan.nextInt();
                quantity = scan.nextInt();
                price = scan.nextFloat();
                totalAmount += quantity * price;

            }
            System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAmount);
    }

}
