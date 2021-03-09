public class IntEqualityPrinter {
    public static void printEqual(int valueIntOne, int valueIntTwo, int valueIntThree) {
        if (valueIntOne < 0 || valueIntTwo < 0 || valueIntThree < 0) {
            System.out.println("Invalid Value");
        } else {
            if (valueIntOne == valueIntThree && valueIntThree == valueIntTwo) {
                System.out.println("All numbers are equal");
            } else if (valueIntOne == valueIntTwo || valueIntTwo == valueIntThree || valueIntOne == valueIntThree) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }
    }
}
