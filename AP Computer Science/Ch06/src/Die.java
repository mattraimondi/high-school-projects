import java.util.Random;

public class Die {
    private Integer numberOfSides;
    private Integer minimumNumberOfSides;

    public Die(int nSides) {
        numberOfSides = nSides;
    }

    public Die(int nSidesMax, int nSidesMin) {
        numberOfSides = nSidesMax;
        minimumNumberOfSides = nSidesMin;
    }

    public int roll() {
        if (minimumNumberOfSides == null) {
            numberOfSides = 6;
            return numberOfSides; //delete
        }
        return 0; //delete
    }
}
