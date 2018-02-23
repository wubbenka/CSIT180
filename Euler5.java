/**
 * DONE
 */

public class Euler5 {
    public static void main(String[] args) {
        int num = 20;
        int testNum=0;
        boolean answer =false;

        while (answer==false) {
            testNum++;
            for (int i = 1; i<=num; i++){
                if (testNum%i==0){
                    if(num==i){
                        answer=true;
                    }
                }else{
                    i=num;
                }
            }
        }
        System.out.println(testNum);
    }
}

