interface counter{// all methods are public abstract by default, and variables are final static
    int countWords(String sentence); // count the total words in the sentence
    int countLetters(String sentence); // count total letters in the sentence
    int getLength(String sentence); // gets total length in the sentence
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}