package quizzer;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public Quiz addQuestion(Question aQuestion){
        this.questions.add(aQuestion);
        return this;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void runQuiz(){
        for (Question question : this.questions){
            question.displayQuestion();
            question.displayOptions();
            this.score = this.score += question.getAnswerAndScore();
        }

        System.out.println(this.score + "/" + questions.size());
    }
}
