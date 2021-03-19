public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int result = 0;
        while(number !=0){
            if((number - (number/10)*10) % 2 == 0){
                result += number - (number/10)*10;
            }
            number /= 10;
        }
        return result;
    }
}
