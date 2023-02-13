package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
      /*
      Write a program that will write to console
      multiplied numbers by input from zero to the number from method arguments using while loop,
      each on new line(program should also be able to work with negatives):

       */

       int count = 0;
       int number = 0;
       if(multiplyByAndToInclusive < 0){
           while(count >= multiplyByAndToInclusive){
               number = (-count) * multiplyByAndToInclusive;
               System.out.println(number);
               count--;


           }
           return;
       }
       while(count <= multiplyByAndToInclusive){
           if (multiplyByAndToInclusive == 0){
               return;
           }
           number = count * multiplyByAndToInclusive;
           System.out.println(number);
           count++;
       }
    }

}
