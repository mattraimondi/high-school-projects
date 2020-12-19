public class BestFit {
    public static int findBestFit(int size1, int size2, int space) {
        int val;

        if (size1 + size2 == space) {
            val = 3;
        } else if (size1 + size2 > space && size1 < size2 && size1 <= space) {
            val = 1;
        } else if (size1 + size2 > space && size2 < size1 && size2 <= space) {
            val = 2;
        } else if (size1 + size2 < space && size1 > size2 && size1 <= space){
            val = 1;
        } else if (size1 + size2 < space && size2 > size1 && size2 <= space){
            val = 2;
        } else if (size1 == size2 && size1 + size2 <= space){
            val = 1;
        } else {
            val = 0;
        }

        return val;
    }

    public static void main(String[] args) {
        System.out.println(findBestFit(0,3,3));
    }
}
