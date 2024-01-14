package BeeCrowd;

public class PrimeNumber {

    public static void primeNum(int num){
        if(num > 0){
            for(int i = 0; i<=num; i++){
                if(num % i == 0 ){
                    System.out.println("not a prime number");
                    break;
                }else {
                    System.out.println("prime Number");
                    break;
                }
            }
        }

    }


    public static void main(String[] args) {

        primeNum(13);
    }
}
