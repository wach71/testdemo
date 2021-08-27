public class Range {
    private String input;

    public Range(String text) {
        this.input = text;
    }

    public boolean isStartWithBracket() {
        return input.startsWith("[");
    }
}
