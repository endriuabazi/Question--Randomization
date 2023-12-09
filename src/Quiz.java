import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Quiz {
    private List<Question> questionsList;
    private int userScore;

    public Quiz(List<Question> questionsList) {
        this.questionsList = questionsList;
        this.userScore = 0;
    }

    public void startQuiz() {
        Collections.shuffle(questionsList);

        int incorrectCount = 0; // Counter for incorrect answers
        int correctCount = 0; // Counter for correct answers

        for (Question question : questionsList) {
            question.displayQuestion();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                userScore++;
                correctCount++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.correctAnswer + "\n");
                incorrectCount++;

                if (incorrectCount >= 3) {
                    this.calculateScore();
                    return;
                }
            }
        }
    }



    private void calculateScore() {
        System.out.println("Quiz completed. Your score: " + userScore + "/" + questionsList.size());
        System.out.println("You've reached the maximum number of incorrect answers. Quiz terminated.");

    }

}