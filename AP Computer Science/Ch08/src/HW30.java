public class HW30 {
    public static void findLetterOccurrences(char letter, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toCharArray()[i] == letter){
                System.out.println(letter + " is at " + word.indexOf(letter, i));
            }
        }
    }

    public static void main(String[] args) {
        findLetterOccurrences('e', "welcome");
    }
}
