import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Word {
    private List<Letter> letters;

    public Word(List<Letter> letters) {
        this.letters = letters;
    }

    public List<Letter> getLetters() {
        return letters;
    }

     /*public boolean isPolindrome(){
        List<Letter> reversedList = new ArrayList<>(letters);
        Collections.reverse(reversedList);
        return letters.equals(reversedList);
     }*/
     public Word(String word){
        letters = new ArrayList();
         for (int i = 0; i < word.length(); i++) {
             Letter letter = new Letter(word.charAt(i));
             letters.add(letter);
         }
     }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < letters.size(); i++) {
            s += letters.get(i);
        }
        return s;
    }
}
