package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        /*
        Write a program that will take int power as an argument.
        This argument will be used to calculate power of 2.
        The program should write to console each value
        for power of 2 beginning from 2^0...2^power.
        Write the program using "while" in case of negative value
        print "too much power":
         */
        if(power < 0){
            System.out.println("too much power");
        }
        int count = 0;
        int number = 2;
        while(count <=power){
            System.out.println((int)Math.pow(number, count));
            count++;
        }
    }
}
