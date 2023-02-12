package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String word = chars.toString();
        int count = 0;

        while(count <=word.length()){
            word += chars;
            count++;
        }
        System.out.println(word);

    }
}
