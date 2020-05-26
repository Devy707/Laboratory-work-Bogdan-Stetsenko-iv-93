import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences;
    private List<Word> str;

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
        }
    }

    public ArrayList getWords() {
        str = new ArrayList();
        for (int i = 0; i < sentences.size(); i++) {
            for (int j = 0; j < getSentences().get(i).getSentenceElements().size(); j++) {
                if (getSentences().get(i).getSentenceElements().get(j) instanceof Punctuation) {
                    continue;
                } else {
                    str.add(new Word(getSentences().get(i).getSentenceElements().get(j).toString()));
                }
            }
        }
        return (ArrayList) str;
    }

    public String getPal(ArrayList<Word> str) {
        int longestOne = 0;
        String palindrome = "";
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).isPolindrome() && str.get(i).toString().length() > longestOne) {
                longestOne = str.get(i).toString().length();
                palindrome = str.get(i).toString();
                System.out.println(str.get(i));
            }
        }
        if(palindrome.equals("")){
            System.out.println("No palindrome in input numbers");
        } else
            System.out.println("Longest palindrome is: ");
        return palindrome;
    }
}



