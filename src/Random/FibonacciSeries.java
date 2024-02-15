package Random;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int fibo = 0;

        for(int i = 0; i<num; i++){
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            fibo = sum ;
            System.out.println(fibo);
        }
        System.out.println("Fibo of " + num + " is :" + fibo);
    }
}
