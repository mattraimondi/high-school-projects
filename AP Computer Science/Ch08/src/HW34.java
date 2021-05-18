public class HW34 {
    // 8.6
    public static String scroll(String str) {
        String letter = str.substring(0,1), newStr = str.replace(str.charAt(0), ' ');
        return newStr.trim() + letter;
    }

    public static void main(String[] args) {
        System.out.println(scroll("Matthew"));
    }
}
