package pl.sda.csvUtils;

public class CsvLine {
    private final int size;
    private String[] split;

    public static final String SEPARATOR = ";";

    public CsvLine(String line) {
        split = line.split(SEPARATOR);
        this.size = split.length;
    }

    public String get(int index) {
        return split[index];
    }

}
