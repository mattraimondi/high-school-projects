public class Arrays {
    public static void one() {
        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            for (int z = 0; z < 5; z++) {
                x[i] *= 5;
            }
        }

        // or x = {1, 5, 25, ...}
    }

    public static void reverse(Object[] input) {
        for (int i = 0 ; i < input.length ; i++) {
            Object temp = input[i];
            input[i] = input[input.length - i];
            input[input.length - i] = temp;
        }
    }

//    public static boolean check(int[][] arr, int colSum) {
//        int targSum = colSum(arr, o);
//        for (int i = 1; i < arr.length; i++) {
//            if (targSum != colSum(arr, i))
//        }
//        return false;
//    }
}
