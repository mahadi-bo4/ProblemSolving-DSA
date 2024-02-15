package Random;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++){
            if(i % 2 == 0){
                System.out.println(i + ", ");
                sum += i;
            }
        }
        System.out.println("Total= " + sum);
    }
}
