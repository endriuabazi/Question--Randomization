
class Question {
    private String questionText;
    String correctAnswer;
    private String category;

    public Question(String questionText, String correctAnswer, String category) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.category = category;
    }

    public void displayQuestion() {
        System.out.println("Category: " + category);
        System.out.println("Question: " + questionText);
    }

    public boolean checkAnswer(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}