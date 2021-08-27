public class Range {
    private String input;

    public Range(String text) {
        this.input = text;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith("[");
    }

    public boolean isStartWithInclusive1() {
        return input.startsWith("(");
    }
}
