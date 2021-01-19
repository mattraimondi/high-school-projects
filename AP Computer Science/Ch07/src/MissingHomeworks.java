public class MissingHomeworks {
    public static int multiplesOf1000() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int reverseDigits(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10;
            rev = rev + n % 10;
            n = n / 10;
        }

        return rev;
    }

    public static boolean isPalindrome(int forwards, int backwards) {
        return (forwards == reverseDigits(backwards));
    }
}
