public class TeenNumberChecker {
    public static boolean hasTeen(int valueOne, int valueTwo, int valueThree) {
        if (valueOne >= 13 && valueOne <= 19) {
            return true;
        }
        if (valueTwo >= 13 && valueTwo <= 19) {
            return true;
        }
        if (valueThree >= 13 && valueThree <= 19) {
            return true;
        }
        return false;


    }

    public static boolean isTeen(int valueOne) {
        return valueOne >= 13 && valueOne <= 19;
    }
}
