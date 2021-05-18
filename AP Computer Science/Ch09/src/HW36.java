public class HW36 {

    public void problem1() {
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 4;

        int sum = intArray[0] + intArray[1] + intArray[2];
    }

    public int[] problem3(int[] x) {
        int first = x[0], last = x[x.length - 1];
        x[0] = last;
        x[x.length - 1] = first;
        return x;
    }
}
