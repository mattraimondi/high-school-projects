public class Date {
    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
        boolean isLeapYear1; // leap year every four years except for years divisible to 100 except to years divisible by 400
        boolean isLeapYear2;

        if (month1 > 12 || month2 > 12) {
            java.lang.System.exit(0);
        }

        if (day1 > 31 || day2 > 31) {
            System.out.println("");
        } else if (month1 == 2  && day1 > 29) {
            if (year1 % 4 == 0) {
                if (year1 % 100 == 0) {
                    if (year1 % 400 == 0) {
                        isLeapYear1 = true;
                    }
                }
            } else {
                isLeapYear1 = true;
            }
        } else if (month2 == 2  && day2 > 29) {
            if (year2 % 4 == 0) {
                if (year2 % 100 == 0) {
                    if (year2 % 400 == 0) {
                        isLeapYear2 = true;
                    }
                }
            } else {
                isLeapYear2 = true;
            }
        }

        return year1 > year2 || year1 == year2 && month1 > month2 || year1 == year2 && month1 == month2 && day1 > day2;
    }

    public static void main(String[] args) {
        System.out.println(isLater(1, 2, 3, 4, 5, 6));
    }
}
