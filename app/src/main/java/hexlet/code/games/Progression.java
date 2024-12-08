package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Settings;
import hexlet.code.Utils;

/**
 * Игра "Арифметическая прогрессия"
 * Показываем игроку ряд чисел, образующий арифметическую прогрессию,
 * заменив любое из чисел двумя точками. Игрок должен определить это число.
 * Рекомендуемая длина прогрессии – 10 чисел. Длина может генерироваться
 * случайным образом, но должна содержать не менее 5-ти чисел!
 * Позиция спрятанного элемента каждый раз изменяется (выбирается случайным образом).
 */

public class Progression {
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_LENGTH = 6;
    private static final String RULES = "What number is missing in the progression?";

    public static void start() {
        Engine.startEngine(RULES, sendGameData());
    }

    public static String[][] sendGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Settings.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            var firstItem = Utils.getRandomNumberFromRange(0, MAX_PROGRESSION_LENGTH);
            var stepOfProgression = Utils.getRandomNumberFromRange(1, MAX_PROGRESSION_LENGTH);
            var progressionLength = Utils.getRandomNumberFromRange(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int[] progression = getRandomProgression(firstItem, stepOfProgression, progressionLength);
            int randomProgressionIndex = Utils.getRandomNumberFromRange(1, progression.length - 2);
            gameData[i][0] = getQuestion(progression, randomProgressionIndex);
            gameData[i][1] = Integer.toString(progression[randomProgressionIndex]);
        }
        return gameData;
    }

    static int[] getRandomProgression(int firstItem, int stepOfProgression, int progressionLength) {
        int[] randomProgression = new int[progressionLength];
        randomProgression[0] = firstItem;
        for (int i = 0; i < progressionLength - 1; i++) {
            randomProgression[i + 1] = randomProgression[i] + stepOfProgression;
        }
        return randomProgression;
    }

    static String getQuestion(int[] randomProgression, int index) {
        String[] stringProgression = new String[randomProgression.length];
        for (int i = 0; i < randomProgression.length - 1; i++) {
            stringProgression[i] = Integer.toString(randomProgression[i]);
        }
        stringProgression[index] = "..";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringProgression.length - 1; i++) {
            stringBuilder.append(stringProgression[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
