public class LipogramAnalyzer {
    private String textContainer;

    public LipogramAnalyzer(String text) {
        textContainer = text;
    }

    public String mark(char letter) {
        return textContainer.replace(letter, '#');
    }

    public String allWordsWith(char letter) {
        StringBuilder newContainer = new StringBuilder();
        for (int i = 0; i < textContainer.split(" ").length; i++) {
            if (textContainer.split(" ")[i].contains("#")) {
                newContainer.append(" ").append(textContainer.split(" ")[i]);
            }
        }
        return newContainer.toString();
    }
}
