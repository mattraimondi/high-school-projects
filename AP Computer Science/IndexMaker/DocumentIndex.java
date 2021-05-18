import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {

    public DocumentIndex() {
        super();
    }

    public DocumentIndex(int cap) {
        super(cap);
    }

    public void addWord(String word, int num) {
        if (this.contains(word)) {
            int ti = this.indexOf(word);
            IndexEntry te = this.get(ti);
            te.add(num);
        } else {
            this.add(new IndexEntry(word));
        }
    }

    public void addAllWords(String str, int num) {
        String[] strArr = str.split(" ");
        for (String i : strArr) {
            addWord(i, num);
        }
    }

    private int foundOrInserted(String word){

    }

}
