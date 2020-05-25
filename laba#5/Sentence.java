import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List sentenceElements;

    public Sentence(List sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    public List getSentenceElements() {
        return sentenceElements;
    }

    public void setSentenceElements(List sentenceElements) {

        this.sentenceElements = sentenceElements;
    }
    public Sentence(String sentence){
        sentenceElements = new ArrayList();
        String[] elementsOfPunctuation = {",", ";", ".", "!", "?"};
        String[] elementsOfSentence = sentence.split("(?<=\\b|[^\\p{L}])", 0);
        for (int i = 0; i < elementsOfSentence.length; i++) {
            for (int j = 0; j < elementsOfPunctuation.length; j++) {
                if (elementsOfSentence[i].contains(elementsOfPunctuation[j])){
                    Punctuation punctuation = new Punctuation(elementsOfSentence[i].charAt(0));
                    sentenceElements.add(punctuation);
                }
            }
            if(!elementsOfSentence[i].equals(" ") && !elementsOfSentence[i].matches("[,.!?;]")){
                Word word1 = new Word(elementsOfSentence[i]);
                sentenceElements.add(word1);
            }
        }


    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < sentenceElements.size(); i++) {
            s += sentenceElements.get(i) + " ";
        }
        return s;
    }
}
