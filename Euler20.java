/**
 *DONE
 */
import java.math.BigInteger;

public class Euler20 {
    public static void main(String[] args) {
        BigInteger givenNum = new BigInteger("100");
        BigInteger sum = new BigInteger("1");
        BigInteger i = new BigInteger("1");

        while (i.compareTo(givenNum)< 0){
            i= i.add(BigInteger.ONE);
            sum = sum.multiply(i);
        }
        System.out.println(sum);

        BigInteger sum2 = new BigInteger("0");
        while (sum.compareTo(BigInteger.ZERO)>0){
            BigInteger num[] = sum.divideAndRemainder(BigInteger.TEN);
            sum=num[0];
            sum2 = sum2.add(num[1]);
        }
        System.out.println(sum2);
    }
}
