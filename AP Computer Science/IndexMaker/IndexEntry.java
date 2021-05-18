import java.util.ArrayList;
import java.util.Locale;

public class IndexEntry {
    private String word;
    private ArrayList<Integer> numList;

    public IndexEntry(String input) {
        this.word = input.toUpperCase(Locale.ROOT);
        this.numList = new ArrayList<Integer>();
    }

    public void add(int num) {
        numList.add(num);
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return this.word + this.numList;
    }
}
