public class Dates {
    public static String americanToEuropean(String input) {
        if (input.length() == 10) {
            String s = "-", m = input.substring(0,2), d = input.substring(3,5), y = input.substring(6,10);
            return d + s + m + s + y;
        } else if (input.length() == 9 || input.length() == 8){
            String newStr = input.replace('/', '-');
            int first = newStr.indexOf('-'), second = newStr.indexOf('-', first);
            String m = newStr.substring(second - 2, second - 1), d = newStr.substring(first - 2, first - 1), y = newStr.substring(second + 1);
            //didnt finish
        } else {
            return "invalid date format";
        }
    }

    public static void main(String[] args) {
        System.out.println(americanToEuropean("9/23/2002"));
    }
}