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

// XOR in Java
// a && !b
// true true false
// true false true
// false true true
// false false false
