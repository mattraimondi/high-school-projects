public class Haiku {
    int lines = 3;
    int[] syllables = {5, 7, 5};

    public  int numLines() {
        return lines;
    }

    public int getSyllables(int k) {
        return syllables[k];
    }
}
