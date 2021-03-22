public class NumberToWords {
    public static void numberToWords(int number) {
        int buffer = reverse(number);
        int check, bufferDigit = getDigitCount(buffer);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= getDigitCount(number); i++) {
                if (i > bufferDigit) {
                    check = 0;
                } else {
                    check = buffer - ((buffer / 10) * 10);
                    buffer /= 10;
                }
                switch (check) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                }
            }
        }
    }

    public static int reverse(int number) {
        int digit = 1, result = 0, buffer = number, count = 0;
        do {
            buffer /= 10;
            count++;
        } while (buffer != 0);

        for (int i = 1; i < count; i++) {
            digit *= 10;
        }
        while (number != 0) {
            result += (number - ((number / 10) * 10)) * digit;
            number /= 10;
            digit /= 10;
        }
        return result;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int result = 0;
        do {
            number /= 10;
            result++;
        } while (number != 0);

        return result;
    }
}