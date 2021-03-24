import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0, input, count = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                if (count != 0) {
                    avg = (double) sum / count;
                }
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                break;
            }
        }
    }
}
