package hexlet.code;

public class Utils {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 1;

    public static int getRandomNumberFromRange(int minRandomNumber, int maxRandomNumber) {
        return (int) ((Math.random() * (maxRandomNumber - minRandomNumber)) + minRandomNumber);
    }

    public static int getRandomNumberFromRange() {
        return (int) ((Math.random() * (MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER)) + MIN_RANDOM_NUMBER);
    }
}
