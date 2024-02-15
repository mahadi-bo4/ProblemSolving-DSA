package Random;

import java.util.Scanner;

public class DivisorOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor;
        int x = sc.nextInt();
        for(int i = 1; i<= 100; i++){
            if(x % i == 0){
                divisor = i;
                System.out.println(divisor);
            }
        }
    }
}
