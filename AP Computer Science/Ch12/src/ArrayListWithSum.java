import java.util.ArrayList;

public class ArrayListWithSum extends ArrayList<Integer> implements ListWithSum {
    public Integer sum() {
        Integer total = 0;
        for (Integer i : this) {
            total += i;
        }
        return total;
    }
}
