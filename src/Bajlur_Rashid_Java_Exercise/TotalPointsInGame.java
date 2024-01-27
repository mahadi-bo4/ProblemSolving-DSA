package Bajlur_Rashid_Java_Exercise;

import java.util.Scanner;


// Calculation of total points in game
// where wins = 3 points, draw = 1 points and lose = 0 points.


public class TotalPointsInGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter wins: ");
        int win = sc.nextInt();
        int winPoint = win * 3;
        System.out.print("Enter draws: ");
        int draw = sc.nextInt();
        int drawPoint = draw * 1;
        System.out.print("Enter loses: ");
        int lose = sc.nextInt();

        int total = winPoint + drawPoint;
        System.out.println("Total points= " + total);
    }
}
