import java.util.List;

public class    Punctuation {
    //обертка
    private char mark;

    public Punctuation(char mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "" + mark;
    }

}
