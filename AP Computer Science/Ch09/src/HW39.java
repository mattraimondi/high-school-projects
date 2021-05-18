import java.awt.Color;

public class HW39 {
    //9.15
    public void fillCheckerBoard(Color[][] board) {
        for (int i = 0; i < board.length; i++) {
            Color[] curArr = board[i];
            if (i % 2 == 0) {
                for (int k = 0; k < curArr.length; k++) {
                    if (k % 2 == 0) {
                        curArr[k] = Color.BLACK;
                    } else {
                        curArr[k] = Color.WHITE;
                    }
                }
            } else {
                for (int k = 0; k < curArr.length; k++) {
                    if (k % 2 == 0) {
                        curArr[k] = Color.WHITE;
                    } else {
                        curArr[k] = Color.BLACK;
                    }
                }
            }
        }
    }

    //9.25
    private final int N = 30;

    public static int[] add(int[] a, int[] b) {
        String aNums = "", bNums = "";

        for (int i = 0; i < a.length; i++){
            aNums = a[i] + aNums;
        }

        for (int k = 0; k < b.length; k++){
            bNums = b[k] + bNums;
        }

        int sum = Integer.parseInt(aNums) + Integer.parseInt(bNums);

        String sumString = sum + "";

        int[] finished = new int[sumString.length()];

        for (int j = 0; j < sumString.length(); j++) {
            finished[j] = sumString.indexOf(j);
        }

        return finished;
    }
}
