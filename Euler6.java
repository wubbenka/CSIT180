/**DONE
 *
 */
public class Euler6 {
    public static void main(String[] args) {
        int natNum = 100;

        int diffSumSquares = sumSquared(natNum) - sumOfSquares(natNum);
        System.out.println(diffSumSquares);
    }

    public static int sumOfSquares (int natNum){
        int sum = 0;
        for (int i=0; i<=natNum; i++){
            int square = i * i;
            sum += square;
        }
        return sum;
    }

    public static int sumSquared (int natNum){
        int sum = 0;
        for (int i = 0; i<= natNum; i++){
            sum += i;
        }
        int answer = sum * sum;
        return answer;
    }
}
