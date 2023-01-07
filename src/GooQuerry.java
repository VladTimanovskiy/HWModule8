public class GooQuerry {
    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    public GooQuerry(String language, String text) {
        this.language = language;
        this.text = text;
    }
    @Override
            public String toString() {
        return "Searching" + text + ", using language: " + language;
    }

    String language;
    String text;
}
