package quizzer;

public abstract class Question {

    private String text;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void displayQuestion() {
        System.out.println(this.text);
    }

    public abstract void displayOptions();

    public abstract int getAnswerAndScore();
}
