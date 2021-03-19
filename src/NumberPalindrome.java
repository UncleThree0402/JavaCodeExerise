public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int buffer = 0, count = 1;
        int check = number;
        while (check != 0) {
            count *= 10;
            check /= 10;
        }
        count /= 10;
        check = number;
        while (check != 0) {
            buffer += (check - (check / 10) * 10) * count;
            check /= 10;
            count /= 10;

        }
        return buffer == number;
    }
}
