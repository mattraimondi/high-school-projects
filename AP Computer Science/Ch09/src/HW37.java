public class HW37 {
    public static int[] createWedge(int n) {
        if (n >= 1) {
            int[] wedge = new int[(n*2)-1];
            for (int i = 1; i <= n; i++) {
                wedge[i-1] = i;
            }
            for (int i = n, k = n; i > 0; i--) {
                if (wedge[wedge.length - 1] == 0) {
                    wedge[k] = i - 1;
                    k++;
                }
            }
            return wedge;
        } else {
            return new int[2];
        }
    }

    public static int computeScore(String word) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] scoreCode = new int[26];
        int sum = 0;

        scoreCode[0] = 1;
        scoreCode[1] = 3;
        scoreCode[2] = 3;
        scoreCode[3] = 2;

        scoreCode[4] = 1;
        scoreCode[5] = 4;
        scoreCode[6] = 2;
        scoreCode[7] = 4;

        scoreCode[8] = 1;
        scoreCode[9] = 8;
        scoreCode[10] = 5;
        scoreCode[11] = 1;

        scoreCode[12] = 3;
        scoreCode[13] = 1;
        scoreCode[14] = 1;
        scoreCode[15] = 3;

        scoreCode[16] = 10;
        scoreCode[17] = 1;
        scoreCode[18] = 1;
        scoreCode[19] = 1;

        scoreCode[20] = 1;
        scoreCode[21] = 4;
        scoreCode[22] = 4;

        scoreCode[23] = 8;
        scoreCode[24] = 4;
        scoreCode[25] = 10;

        for (int i = 0; i < word.length(); i++) {
            sum += scoreCode[word.indexOf(word.charAt(i))];
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
