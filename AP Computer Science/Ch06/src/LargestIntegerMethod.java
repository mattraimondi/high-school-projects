public class LargestIntegerMethod {
    public static int LargestInteger(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }

    public static int max(int x, int y, int z) {
        return LargestInteger(x, LargestInteger(z, y));
    }
}
