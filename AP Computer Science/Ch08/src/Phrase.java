// HW33
public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public String getPhrase() {
        return currentPhrase;
    }

    // Hidden implementation
    public int findNthOccurrence(String str, int n) {
        return n;
    }

    // A
    public void replaceNthOccurrence(String str, int n, String repl) {
        int spot = findNthOccurrence(str, n);
        if (spot != -1) {
            currentPhrase = currentPhrase.substring(0, spot) + repl + currentPhrase.substring(spot + 1);
        }
    }

    // B
    public int findLastOccurrence(String str) {
        int k = 0;

        for (int i = 0; i <= currentPhrase.length(); i++) {
            if (findNthOccurrence(str, i) != -1) {
                k++;
            }
        }

        if (k == 0)
            return -1;
        else
            return findNthOccurrence(str, k);
    }
}
