public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number <0){
            return -1;
        }
        int check = number, count = 0, result;
        int first = 0, last;
        while (check != 0) {
            check /= 10;
            count++;
        }
        check = number;
        last = (check - (check / 10) * 10);
        while (check != 0) {
            first = (check - (check / 10) * 10);
            check /= 10;
        }
        return first + last;

    }

}
