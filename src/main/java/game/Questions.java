package game;

public class Questions {
    public static Question[] questions = new Question[5];

    static {
        Question firstQuestion = new Question(
                "Назовите столицу Австралии.",
                "Сидней.",
                "Канберра.",
                "Брисбен.",
                "Мельбурн",
                2);
        Question secondQuestion = new Question(
                "Назовите столицу России.",
                "Санкт-Петербург",
                "Москва",
                "Великий Новгород.",
                "Екатеринбург",
                2);
        Question thirdQuestion = new Question(
                "Назовите столицу Португалии.",
                "Лиссабон",
                "Коимбра.",
                "Порту.",
                "Брага",
                1);
        Question fourthQuestion = new Question(
                "Назовите столицу Бразилии.",
                "Рио-де-Жанейро.",
                "Манаус.",
                "Сан-Паулу.",
                "Бразилиа",
                4);
        Question fifthQuestion = new Question(
                "Назовите столицу Китая.",
                "Шанхай.",
                "Гуанчжоу.",
                "Пекин.",
                "Тяньцзинь",
                3);
        questions[0] = firstQuestion;
        questions[1] = secondQuestion;
        questions[2] = thirdQuestion;
        questions[3] = fourthQuestion;
        questions[4] = fifthQuestion;
    }
}
