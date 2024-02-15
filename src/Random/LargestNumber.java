package Random;

import java.util.Scanner;

public class LargestNumber {

    static Scanner sc = new Scanner(System.in);
    static int large;
    static int x = sc.nextInt();
    static int y = sc.nextInt();
    static int z = sc.nextInt();

    public static void main(String[] args) {
        large = (x > y)?(Math.max(x, z)):(Math.max(y, z));
        System.out.println(large);
    }
}
