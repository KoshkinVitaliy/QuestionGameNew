package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void startGame() {
        System.out.println("Game started.");

        showQuestion();
    }

    private static void showQuestion() {
        System.out.println(Questions.questions[0].getQuestion());
        System.out.println("-----------------------------------");
        System.out.println("1. " + Questions.questions[0].getFirstAnswer());
        System.out.println("2. " + Questions.questions[0].getSecondAnswer());
        System.out.println("3. " + Questions.questions[0].getThirdAnswer());
        System.out.println("4. " + Questions.questions[0].getFourthAnswer());

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
        if (userAnswer == Questions.questions[0].getCORRECT_NUMBER_INDEX()) {
            System.out.println("Вы победили!");
        }
        else {
            System.out.println("Вы проиграли!");
        }
    }
}
