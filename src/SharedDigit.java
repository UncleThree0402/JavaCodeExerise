public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        int bufferOne = numberOne, bufferTwo = numberTwo;
        int resultOne, resultTwo;
        if (numberOne >= 10 && numberOne <= 99 && numberTwo >= 10 && numberTwo <= 99) {
            while (bufferOne != 0) {
                resultOne = (bufferOne - (bufferOne / 10) * 10);
                while (bufferTwo != 0) {
                    resultTwo = (bufferTwo - (bufferTwo / 10) * 10);
                    if (resultOne == resultTwo) {
                        return true;
                    }
                    bufferTwo /= 10;
                }
                bufferTwo = numberTwo;
                bufferOne /= 10;
            }
        }
        return false;
    }
}
