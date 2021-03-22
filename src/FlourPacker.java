public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            if (goal / 5 > 0) {
                if (goal / 5 <= bigCount) {
                    goal = goal - ((goal / 5) * 5);
                } else {
                    goal = goal - (bigCount * 5);
                }
            }
            return smallCount >= goal;
        }
    }
}
