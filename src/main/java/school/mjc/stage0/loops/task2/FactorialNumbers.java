package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        /*
        Write a program that will write to console
        all numbers from factorial row, from 0 up to input
        from method arguments using while loop, each on new line:
         */
        int count = 1;
        int factorial = 1;

        System.out.println(1);

        while(count <= printToInclusive){
            factorial = factorial * count;
            System.out.println(factorial);
            count++;
        }


    }
}
