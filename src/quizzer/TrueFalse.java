package quizzer;

import java.util.Scanner;

public class TrueFalse extends Question {

    private boolean correctAnswer;

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public TrueFalse(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayOptions() {
        System.out.println("True or False");
    }

    @Override
    public int getAnswerAndScore() {
        Scanner answer = new Scanner(System.in);
        String userAnswer = answer.nextLine();
        boolean result = Boolean.parseBoolean(userAnswer);

        if (result == correctAnswer){
            return 1;
        } else {
            return 0;
        }
    }
}
