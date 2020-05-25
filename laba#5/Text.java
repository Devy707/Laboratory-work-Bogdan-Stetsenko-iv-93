import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences;

    public Text(List sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public Text(String text) {
        sentences = new ArrayList();
        String[] s = text.split("\n");
        for (int i = 0; i < s.length; i++) {
            sentences.add(new Sentence(s[i]));
        };
    }
}



