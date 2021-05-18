public class Limerick {
    int lines = 5;
    int[] syllables = {9, 9, 6, 6, 9};

    public  int numLines() {
        return lines;
    }

    public int getSyllables(int k) {
        return syllables[k];
    }
}
