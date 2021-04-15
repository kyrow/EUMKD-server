package isr.eumkd.models;

import java.util.Objects;

public class Answer {
    public Answer(int questionNumber, char answer) {
        this.questionNumber = questionNumber;
        this.answer = answer;
    }

    private final int questionNumber;
    private final char answer;


    public int getQuestionNumber() {
        return questionNumber;
    }

    public char getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return questionNumber == answer1.questionNumber && answer == answer1.answer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionNumber, answer);
    }
}
