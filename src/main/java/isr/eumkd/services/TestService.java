package isr.eumkd.services;

import isr.eumkd.models.Answer;
import isr.eumkd.models.Result;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public Result checkTest(int testNo, Answer[] answers) throws Exception {
        int correctAnswersAmount = 0;
        Answer[] rightAnswers = getRightAnswers(testNo);
        for (Answer answer: answers) {
            if (getAnswer(answer.getQuestionNumber(), rightAnswers).equals(answer)) {
                correctAnswersAmount++;
            }
        }
        return new Result(answers.length, correctAnswersAmount);
    }

    private Answer getAnswer(int questionNumber, Answer[] answers) throws Exception {
        for (Answer answer: answers) {
            if (answer.getQuestionNumber() == questionNumber) {
                return answer;
            }
        }
        throw new Exception("Unable to get answer with requested index");
    }

    private Answer[] getRightAnswers(int testNo) throws Exception {
        switch (testNo) {
            case 1:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 2:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 3:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 4:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 5:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 6:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 7:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 8:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 9:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            case 10:
                return new Answer[] {
                        new Answer(1, 'a'),
                        new Answer(2, 'a'),
                        new Answer(3, 'a'),
                        new Answer(4, 'a'),
                        new Answer(5, 'a'),
                        new Answer(6, 'a'),
                        new Answer(7, 'a'),
                        new Answer(8, 'a'),
                        new Answer(9, 'a'),
                        new Answer(10, 'b')
                };
            default:
                throw new Exception("No answers found for requested test number:" + testNo);
        }
    }
}
