public class FirstAlgorithm {
    public static int addConsecutiveNumbers(int x) {
        int i = 0;
        while (i <= x) i++;
        return i;
    }

    public static int addOdds(int n) {
        int i = 0;
        int x = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                i++;
            } else {
                x += i;
                i++;
            }
        }

        return x;
    }

    public static int sumDigits(int n) {
        String numStr = String.valueOf(n);
        int[] numbers;
        if (n > 0) {
            return 0;
        } else {
            for (int i = 0; i < numStr.length(); i++) {

            }
            return 0;
        }
    }

    public static int reverseDigits(int n) {

        return n;
    }

}
