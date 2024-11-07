package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private static int numberOfQuestion;
    public static void startGame() {
        System.out.println("Game started.");

        showQuestion();
    }

    private static void showQuestion() {
        System.out.println(Questions.questions[numberOfQuestion].getQuestion());
        System.out.println("-----------------------------------");
        System.out.println("1. " + Questions.questions[numberOfQuestion].getFirstAnswer());
        System.out.println("2. " + Questions.questions[numberOfQuestion].getSecondAnswer());
        System.out.println("3. " + Questions.questions[numberOfQuestion].getThirdAnswer());
        System.out.println("4. " + Questions.questions[numberOfQuestion].getFourthAnswer());

        getUserAnswer();
    }

    private static void getUserAnswer() {
        System.out.println("Ваш ответ: ");

        try {
            Scanner sc = new Scanner(System.in);
            var userAnswer = sc.nextInt();

            checkAnswer(userAnswer);
        }
        catch (InputMismatchException e) {
            System.out.println("Неккоретно введён ответ. Попробуйте ещё.");

            getUserAnswer();
        }
    }

    private static void checkAnswer(int userAnswer) {
        if(userAnswer == Questions.questions[numberOfQuestion].getCORRECT_NUMBER_INDEX()) {
            System.out.println("Вы победили!");

            checkQuestions();
        }
        else {
            System.out.println("Вы проиграли!");

            checkQuestions();
        }
    }

    private static void checkQuestions() {
        numberOfQuestion++;
        if (numberOfQuestion == Questions.questions.length) {
            System.exit(0);
        }
        else showQuestion();
    }
}
