public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int result = 0;
        if(number > 0){
            for(int i = 1; i < number;i++){
                if(number % i == 0){
                    result += i;
                }
            }
            return result == number;
        }
        return false;
    }
}
