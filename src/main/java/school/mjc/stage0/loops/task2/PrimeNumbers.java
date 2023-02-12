package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for( int startNumber = 2; startNumber <= printToInclusive; startNumber++){
            boolean isPrime = true;
            for(int factor = 2; factor < startNumber; factor++){
                if (startNumber % factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(startNumber);
            }
        }

    }}

