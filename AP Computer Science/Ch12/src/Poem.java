public abstract class Poem {
    public abstract int numLines();

    public abstract int getSyllables(int k);

    public void printRhythm() {
        for (int i = 0; i < numLines(); i++) {
            System.out.println("ta");
        }
    }
}
