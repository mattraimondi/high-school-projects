public class Square {
    private int sideLength;

    public Square() {
        sideLength = 1; // default value
    }

    public Square(int side) {
        sideLength = side;
    }

    public int getArea() {
        return sideLength * sideLength;
    }
}
