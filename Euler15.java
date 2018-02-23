/**
 * Done
 * TO BE TURNED IN
 */

import java.math.BigInteger;

public class Euler15 {
    public static void main(String[] args) {
        long n = 40;
        long k = n/2;    //for greatest value in line
        BigInteger answer = (factorial(n).divide(factorial(k).multiply(factorial(n-k))));
        System.out.println(answer);


    }

    public static BigInteger factorial (long x){
        BigInteger total = BigInteger.ONE;

        for (int i =1; i<(x+1);i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }

}
