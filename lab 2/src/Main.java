import java.util.Scanner;

interface counter{// all methods are public abstract by default, and variables are final static
    int countWords(String sentence); // count the total words in the sentence
    int countLetters(String sentence); // count total letters in the sentence
    int getLength(String sentence); // gets total length in the sentence
}

class wordProcessor implements counter {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override// using annotations
    public int countWords(String sentence) {

        if (sentence == null) {
            return 0;
        } else {
            String[] words = sentence.split(" "); // convert sentence into array and count it
            return words.length;
        }
    }

    @Override
    public int countLetters(String sentence) {
        if (sentence == null) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.isLetter(sentence.charAt(i)))
                    count++;
            }
            return count;
        }
    }

    @Override
    public int getLength(String sentence) {// for loop to iterate over all the letter and count them

        if (sentence == null) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                count++;
            }
            return count;
        }


    }
}

public class Main {
    public static void main(String[] args) {

        wordProcessor wp = new wordProcessor();

        Scanner input = new Scanner(System.in);
        System.out.println("please input a sentence");
        String text = input.nextLine();
        wp.setText(text);
        input.close(); // closing input to save leaking memory


        int final_word_count = wp.countWords(text); // check with text
        System.out.println("word count: " + final_word_count);
        int final_word_count_null = wp.countWords(null);
        System.out.println("word count with null: " + final_word_count_null);

        int final_letter_count = wp.countLetters(text);
        System.out.println("letter count: " + final_letter_count);
        int final_letter_count_null = wp.countLetters(null);
        System.out.println("letter count with null: " + final_letter_count_null);

        int final_length_count = wp.getLength(text);
        System.out.println("length count: " + final_length_count);
        int final_length_count_null = wp.getLength(null);
        System.out.println("length count with null: " + final_length_count_null);
    }
}