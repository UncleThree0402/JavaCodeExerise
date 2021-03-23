public class LargestPrime {
    public static int getLargestPrime(int number) {
        int check = number, prime = 2;
        if (number > 1) {
            loop1:
            for (int i = 2; i <= check; i++) {
                if (check % i == 0) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            continue loop1;
                        }
                        prime = i;
                    }
                    check /= i;
                    i = 2;
                }
            }
            return prime;
        }
        return -1;
    }
}
