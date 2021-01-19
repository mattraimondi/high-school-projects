public class SnippetsFromTest {
    public static int problem1() {
        double x = 1000.0;
        int y = 0;
        while (x < 3000.0) {
            x += (x*0.05);
            y++;
        }
        return y;
    }

    public static int problem2(int input) {
        int k = input;
        while (k != (int)(k * 0.01 * 100.0)) {
            k--;
        }
        return k;
    }

    public static void problem3(int input) {
        int y = input;
        while (y > 0) {
            for (int x = 0; x < y; x++) {
                System.out.print(y + " ");
            }
            System.out.println();
            y--;
        }
    }

    public static int someFun2(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(problem1());
        problem3(5);
    }
}
