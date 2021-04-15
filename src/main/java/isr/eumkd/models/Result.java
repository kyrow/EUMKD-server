package isr.eumkd.models;

public class Result {
    public Result(int answersAmount, int correctAnswersAmount) {
        this.answersAmount = answersAmount;
        this.correctAnswersAmount = correctAnswersAmount;
    }

    public int getQuestionsAmount() {
        return answersAmount;
    }

    public void setQuestionsAmount(int questionsAmount) {
        this.answersAmount = questionsAmount;
    }

    public int getCorrectAnswersAmount() {
        return correctAnswersAmount;
    }

    public void setCorrectAnswersAmount(int correctAnswersAmount) {
        this.correctAnswersAmount = correctAnswersAmount;
    }

    private int answersAmount;
    private int correctAnswersAmount;
}
