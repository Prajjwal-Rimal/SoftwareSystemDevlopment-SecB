import java.util.Scanner;

interface counter{// all methods are public abstract by default, and variables are final static
    int countWords(String sentence); // count the total words in the sentence
    int countLetters(String sentence); // count total letters in the sentence
    int getLength(String sentence); // gets total length in the sentence
}

class wordProcessor implements counter{
    @Override// using annotations
    public int countWords(String sentence) {
        String[] words = sentence.split(" "); // convert sentence into array and count it
        return words.length;
    }

    @Override
    public int countLetters(String sentence) { // for loop and is char to only find actual char letters
        int count =0;
        for (int i = 0; i < sentence.length(); i++) {
            if ( Character.isLetter(sentence.charAt(i)) )
                count++;
        }
        return count;
    }

    @Override
    public int getLength(String sentence) { // for loop to iterate over all the letter and count them
        int count =0;
        for (int i = 0; i < sentence.length(); i++) {
            count++;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please input a sentence");
        String text = input.nextLine();
        input.close();

        wordProcessor wp = new wordProcessor();
        int final_word_count = wp.countWords(text);
        System.out.println(final_word_count);

        int final_letter_count = wp.countLetters(text);
        System.out.println(final_letter_count);

        int final_length_count = wp.getLength(text);
        System.out.println(final_length_count);
    }
}