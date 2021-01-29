package quizzer;

import java.util.HashMap;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private HashMap<Integer, String> options;
    private String correctAnswer;

    public MultipleChoice(String text, HashMap<Integer, String> options, String correctAnswer) {
        super(text);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public HashMap<Integer, String> getOptions() {
        return options;
    }

    public void setOptions(HashMap<Integer, String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayOptions() {
        for (Integer key : this.options.keySet()){
            System.out.println(key + ": " + this.options.get(key));
        }
    }

    @Override
    public int getAnswerAndScore() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Pick 1-4");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (this.options.get(result).equals(this.correctAnswer)) {
            return 1;
        }
        else {
            return 0;
        }

    }
}
