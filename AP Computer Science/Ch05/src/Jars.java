public class Jars {
    public static double computeShippingCost(int nJars) {
        int nCartons = (nJars + 11) / 12;
        int totalOunces = (21 * nJars) + (25 * nCartons);
        double lbs = (totalOunces / 16.0);
        return ((nCartons * 1.44) + (lbs * 0.96) + (3));
    }

    public static void main(String[] args) {
        System.out.println(computeShippingCost(8));
    }

}
