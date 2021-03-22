public class FactorPrinter {
    public static void printFactors(int number) {
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
