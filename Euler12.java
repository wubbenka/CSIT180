/**
 * Done
 * Turn in
 */

public class Euler12 {
    public static void main(String args[]) {
        int nthTriangleNumber = 0;
        long triangleNumberValue = 0;
        int divisorCount =0;

        while(divisorCount<500){
            nthTriangleNumber++;
            divisorCount=0;
            triangleNumberValue +=nthTriangleNumber;


            for (int i = 1; i<(long)(Math.sqrt(triangleNumberValue)+1); i++) {
                if (triangleNumberValue % i == 0) {
                    divisorCount +=2;
                }
            }
        }
        System.out.println(triangleNumberValue);
    }
}
