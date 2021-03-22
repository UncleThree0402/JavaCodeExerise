public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree){
        if(isValid(numberOne) && isValid(numberTwo) && isValid(numberThree)){
            numberOne = numberOne - (numberOne/10)*10;
            numberTwo = numberTwo - (numberTwo/10)*10;
            numberThree = numberThree - (numberThree/10)*10;
            return numberOne == numberTwo || numberOne == numberThree || numberTwo == numberThree;
        }
        return false;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
