package LeetCode;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int orginalNumber = x;
        int reversed = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int module = x % 10;
            reversed = reversed * 10 + module;
            x /= 10;
        }
        return reversed == orginalNumber;
    }

    public static void main(String[] args) {
        boolean b = isPalindrome(-121);
        System.out.println(b);
    }
}
