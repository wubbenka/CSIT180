/**
 * DONE
 */
public class Euler7 {
    public static void main(String[] args) {
        int primeNumCount = 10001;
        int count = 1;
        int biggestPrime = 0;

        for (int num = 2; count <= primeNumCount; num++){
            if(isPrime (num)){
                count++;
                biggestPrime = num;
            }
        }
        System.out.println(biggestPrime);
    }

    public static boolean isPrime (int num){
        for (int i = 2; i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
