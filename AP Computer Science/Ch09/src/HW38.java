public class HW38 {
    public int problem14(int[][] numArrArr) {
        int q = 0;
        for (int i = 0; i < numArrArr.length; i++) {
            int[] curArr = numArrArr[i];
            int j = 0;
            for (int k = 0; k < curArr.length; k++) {
                if (curArr[k] > j) {
                    j = curArr[k];
                }
            }
            q = j;
        }
        return q;
    }

    public void problem13(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int p = i;
            int[] thisRow = matrix[i];
        }
    }
}
