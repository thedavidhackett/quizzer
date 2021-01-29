package quizzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CheckBox extends Question {

    private HashMap<Integer, String> options;
    private ArrayList<Integer> correctAnswers;

    public CheckBox(String text, HashMap<Integer, String> options, ArrayList<Integer> correctAnswers) {
        super(text);
        this.options = options;
        this.correctAnswers = correctAnswers;
    }

    public HashMap<Integer, String> getOptions() {
        return options;
    }

    public void setOptions(HashMap<Integer, String> options) {
        this.options = options;
    }

    public ArrayList<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<Integer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void displayOptions() {
        for (Integer key : options.keySet()){
            System.out.println(key + ": " + options.get(key));
        }
    }

    @Override
    public int getAnswerAndScore() {
        Scanner answer = new Scanner(System.in);
        int result;
        String continueQuiz = "y";
        ArrayList<Integer> userAnswers = new ArrayList<>();
        while (continueQuiz.equals("y")){
            System.out.println("Type a correct number then hit enter");
            String userAnswer = answer.nextLine();
            result = Integer.parseInt(userAnswer);
            userAnswers.add(result);
            System.out.println("More Answers? y/N");
            continueQuiz = answer.nextLine();
        }
        if (this.correctAnswers.equals(userAnswers)) {
            return 1;
        }
        else {
            return 0;
        }

    }
}
