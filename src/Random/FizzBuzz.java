package Random;

public class FizzBuzz {
    public static void main(String[] args) {
        Integer num = 20;
        for (int i = 0; i < num; i++){
            Object result = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz"
                    : (i % 3 == 0)? "Fizz" : (i % 5 == 0) ? "Buzz" :  i;

            System.out.println(result);
        }
    }
}
