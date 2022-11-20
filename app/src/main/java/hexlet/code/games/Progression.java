package hexlet.code.games;
import hexlet.code.Engine;
public class Progression {
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_LENGTH = 6;
    public static void rules() {
        System.out.println("What number is missing in the progression?");
    }
    public static String[][] setGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Engine.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int[] progression = getRandomProgression();
            int randomProgressionIndex = Engine.getRandomNumberFromRange(1, progression.length - 2);
            gameData[i][0] = getQuestion(progression, randomProgressionIndex);
            gameData[i][1] = Integer.toString(progression[randomProgressionIndex]);
        }
        return gameData;
    }
    static int[] getRandomProgression() {
        final int firstItem = Engine.getRandomNumberFromRange(0, MAX_PROGRESSION_LENGTH);
        var stepOfProgression = Engine.getRandomNumberFromRange(1, MAX_PROGRESSION_LENGTH);
        int randomProgressionLength = Engine.getRandomNumberFromRange(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int[] randomProgression = new int[randomProgressionLength];
        randomProgression[0] = firstItem;
        for (int i = 0; i < randomProgressionLength - 1; i++) {
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
