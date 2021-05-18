public class HW40 {
    //9.24
    public static void rotateLeft(int[] a) {
        int first = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = first;
    }

    public static void rotateRight(int[] a) {
        int last = a[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            a[i + 1] = a[i];
        }
        a[0] = last;
    }

    public static void rotate(int[] a, int b) {
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                rotateRight(a);
            }
        } else {
            for (int i = -b; i > b; i--) {
                rotateLeft(a);
            }
        }
    }
}
