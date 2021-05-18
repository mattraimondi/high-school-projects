import java.util.ArrayList;
import java.lang.Math;

public class LineList extends ArrayList<String> {

    /**
     * Moves the item at spot a to spot b
     * @param a
     * @param b
     */
    public void move(int a, int b) {
        String s = remove(a);
        add(b, s);
    }

    /**
     * Swaps the values at positions a and b
     * Precondition: a < b
     * @param a
     * @param b
     */
    private void swap(int a, int b) {
        move(a, b);
        move(b-1, a);
    }

    public void shuffle() {
        for (int n = size() - 1; n >=0; n--) {
            int randomSpot = (int)(Math.random() * n);
            swap(randomSpot, n);
        }
    }
}
