public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number >= 5) {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == number - 1 || i == 0 || i == number - 1 || i == j || i == number - j - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
