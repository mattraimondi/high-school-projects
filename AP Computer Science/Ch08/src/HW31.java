import java.lang.reflect.Array;

public class HW31 {
    public static char[] removeIndex(char[] array, int index) {
        char[] copy = new char[array.length - 1];

        for (int i = 0, j = 0; i < array.length - 1; i++) {
            if (i != index) {
                copy[j] = array[i];
                j++;
            }
        }

        return copy;
    }

    public static String removeVowels(String text) {
        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length;) {
            char x = (char) Array.get(textArray, i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' ||x == 'u') {
                textArray = removeIndex(textArray, i);
            } else {
                i++;
            }
        }

        return new String(textArray);
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("Matthew Raimondi"));
    }
}
