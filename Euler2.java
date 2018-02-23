/**DONE
 *
 */
public class Euler2 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int sum = 0;
        int littleSum= 0;

        while (littleSum < 4000000){
            littleSum = first + second;
            if (littleSum % 2 == 0){
               sum += littleSum;
            }
            first = second;
            second = littleSum;
        }
        System.out.println(sum);
    }
}
