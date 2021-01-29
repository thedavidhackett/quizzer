package quizzer;

import java.util.ArrayList;
import java.util.HashMap;

public class QuizRunner {

    public static void main(String[] args){

        Quiz quiz = new Quiz();

        TrueFalse question1 = new TrueFalse("Is this gonna work", true);
        HashMap<Integer, String> question2Options = new HashMap<>();
        question2Options.put(1, "Imos");
        question2Options.put(2, "Dominoes");
        question2Options.put(3, "Papa John's");
        question2Options.put(4, "Pizza Head");
        MultipleChoice question2 = new MultipleChoice("What is the best pizza?", question2Options, "Imos");
        HashMap<Integer, String> question3Options = new HashMap<>();
        question3Options.put(1, "I love launchcode");
        question3Options.put(2, "I hate launchcode");
        question3Options.put(3, "I hate launchcode sometimes");
        question3Options.put(4, "meh");
        ArrayList<Integer> question3Answers = new ArrayList<>();
        question3Answers.add(1);
        question3Answers.add(3);
        CheckBox question3 = new CheckBox("How do you feel about launchcode?", question3Options, question3Answers);

        quiz.addQuestion(question1).addQuestion(question2).addQuestion(question3);

        quiz.runQuiz();
    }

}
