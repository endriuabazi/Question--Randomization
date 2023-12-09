import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Question> questionPool = loadQuestionsFromFile("src\\questions.txt");

        if (questionPool.isEmpty()) {
            System.out.println("No questions loaded. Exiting.");
            return;
        }

        Quiz quiz = new Quiz(questionPool);
        quiz.startQuiz();
    }

    private static List<Question> loadQuestionsFromFile(String filePath) {
        List<Question> questions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|"); // Assuming questions are separated by '|'
                if (parts.length == 3) {
                    questions.add(new Question(parts[0], parts[1], parts[2]));
                } else {
                    System.out.println("Invalid question format: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return questions;
    }
}
