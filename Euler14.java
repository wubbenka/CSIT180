public class Euler14 {
    public static void main(String[] args) {
        int startingNumber = 1;
        int chainCount = 0;
        int maxChainCount = 0;
        int maxChainCountStart=0;

        while (startingNumber<1000000){
            chainCount = 0;
            int collatz = startingNumber;
            while (collatz!=1){
                if(collatz%2==0){
                    collatz= collatz/2;
                } else {
                    collatz = 3*collatz+1;
                }
                chainCount++;
            }
            if (chainCount>maxChainCount){
                maxChainCountStart=startingNumber;
            }
            startingNumber++;
        }
        System.out.println(maxChainCountStart);
    }
}
