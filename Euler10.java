/**
 *Done
 */
public class Euler10 {
    public static void main(String[] args) {
        long primesBelow = 2000000;
        long primeSum = 0;

        for (long num = 2; num < primesBelow; num++){
            if(isPrime (num)){
                primeSum += num;
                System.out.println(primeSum);
            }

        }

}
    public static boolean isPrime (long num){
        for (long i = 2; i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
