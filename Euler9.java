/**
 *Done
 */
public class Euler9 {
    public static void main(String[] args) {
        double answer = 0;
        int finA = 0, finB = 0, finC = 0;


        for (int a = 1; a<999; a++){
            for ( int b = 1; b<999; b++){
                double cSquared = a*a + b*b;
                if (Math.sqrt(cSquared)%1==0) {
                    int c = (int) (Math.sqrt(cSquared));
                    if (a + b + c == 1000) {
                        finA = a;
                        finB = b;
                        finC = c;
                        System.out.println(finA + " " + finB + " " + finC);
                    }
                }
            }

        }
        System.out.println(finA*finB*finC);
    }
}
