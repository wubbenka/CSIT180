/**
 * DONE
 */
public class Euler4 {
    public static void main(String[] args) {
        int MAXNUM = 1000;
        int num1 = 0;
        int num2 = 0;
        int answer = 0;

        for (int i = 900; i<MAXNUM; i++){
            for(int j = 900; j<MAXNUM; j++){
                long product = i*j;
                long reverse = 0;
                while (product != 0){
                    reverse += product%10;
                    product = product/10;
                    if (reverse ==(i*j)){
                        num1 = i;
                        num2 = j;
                        answer = i*j;
                    }
                    reverse = reverse *10;
                }
            }
        }
        System.out.println(num1 + " * " + num2 + "\n" +answer);


    }
}
