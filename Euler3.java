/**
 * DONE
 */

import java.math.BigInteger;

public class Euler3 {
    public static void main(String[] args) {
        BigInteger givenNum = new BigInteger("600851475143");
        BigInteger i = new BigInteger("1");
        BigInteger largestFactor = new BigInteger("0");
        BigInteger ZERO = new BigInteger("0");
        BigInteger ONE = new BigInteger("1");

        while (i.compareTo(givenNum) <= 0) {
            i=i.add(ONE);
            BigInteger bi[] = givenNum.divideAndRemainder(i);
            if (bi[1].compareTo(ZERO) == 0) {
                givenNum = givenNum.divide(i);
                largestFactor = i;
            }
        }
        System.out.println(largestFactor);
    }
}
