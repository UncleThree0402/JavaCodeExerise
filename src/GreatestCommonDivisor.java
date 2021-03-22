public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int result = 1;
        if (first >= 10 && second >= 10) {
            for (int i = 1; i <= Math.max(first, second); i++) {
                if (first % i == 0 && second % i == 0) {
                    result = i;
                }
            }
            return result;
        }
        return -1;
    }
}
