# Quiz Game Java Application

## Overview

This Java application is a simple quiz game where questions are randomly selected from a file that is inside the project. The project uses Object-Oriented Programming (OOP) principles to model questions, answers, and quiz sessions. It also implements a data structure (e.g., List) to store the question pool and allows loading different sets of questions from files for diverse quiz experiences.

## Table of Contents
- [Prerequisites]
    Before running the application you must have at least one program that runs java into your computer. For example:
    **Java Development Kit (JDK):** This project requires Java to be installed. You can download and install the latest version of JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).

    **Git:** If you haven't already, install Git to clone the project repository and access the source code. You can download Git from [git-scm.com](https://git-scm.com/downloads).
- [Getting Started]
  To get started is very easily. In the repo, to the Code part, copy the https link and make a git clone this url into the folder that you have chosen into your computer.
  Steps to  clone the repository:

    ```bash
    git clone https://github.com/your-username/quiz-game-java.git
    ```
- [Running the Quiz]
After cloning the repo, is quite easily to run the application, go to main file and click run. Immediatly you will have into the terminal the first question appeared.
- [Project Structure]
  This quiz game application has three files.
  -Quiz file is responsible for managing the quiz session.
 - Properties:
   - questionsList: A list that holds instances of the Question class. This list represents the pool of questions available for the quiz.
   - userScore: An integer that keeps track of the user's score during the quiz.
 - Methods:
   - startQuiz(): Initiates the quiz session. It shuffles the questionsList to randomize the order of questions and then iterates through each question, prompting the user for answers.
   - calculateScore(): Computes and displays the user's final score at the end of the quiz session.
- The Question file represents an individual quiz question. 
  - Properties:
    - questionText: A string containing the text of the question.
    - correctAnswer: A string representing the correct answer to the question.
    - category: A string indicating the category to which the question belongs (e.g., Geography, History).
  - Methods:
    - displayQuestion(): Prints the question to the console, including the category and the question text.
    - checkAnswer(userAnswer): Takes a user-provided answer as an argument and checks whether it matches the correct answer. Returns a boolean indicating whether the user's answer is correct.
  - Main file is resposible for creating and initializing each of these upper mentioned classes in order to run the application.
- [Contributing]
  This project is worked by Suana Prebibaj and Endriu Abazi.
- [File Format]
 Questions are loaded from a text file (`questions.txt`) and also the answers are inside the the text file.



