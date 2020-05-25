import java.lang.*;
import java.util.*;
public class laba551 {
    public static void main(String[] args) {
        String text = "With this example we are abbba to, demonstrate how to reverse the order of a List. \n" +
                "The ArrayList is used as a List implementation, but the same API applies to any type of List \n" +
                "implementation classes Vector etc. In short, to reverse the order of a List you should. \n";
        String sentence11 = "With this example we are to aaaaaaaaaaa,  how to reverse the order of a List.";
        String sentence22 = "The ArrayList is used as a List implementation, but the same API applies to any type of List";
        String sentence33 = "implementation classes Vector etc. In short, to bbbbbbbbaabbbbbbbb the order of a List you should.";
        Text text1 = new Text(text);
        System.out.println(text1.getSentences());
        Sentence sentence = new Sentence(sentence11);
        Sentence sentence1 = new Sentence(sentence22);
        Sentence sentence3 = new Sentence(sentence33);
        System.out.println(sentence.getSentenceElements());
        System.out.println(sentence1.getSentenceElements());
        System.out.println(sentence3.getSentenceElements());
        String[] p1 = {",", ";", ".", "!", "?"};
        ArrayList<String> p2 = new ArrayList<String>();
        for (int i = 0; i < p1.length; i++) {
            p2.add(p1[i]);
        }
        System.out.println(p2);
        Word o = (Word) sentence.getSentenceElements().get(0);
        System.out.println(o);
        ArrayList<String> str = new ArrayList<String>();
        String[] t = {};
        for (int i = 0; i < sentence.getSentenceElements().size(); i++) {
            str.add(sentence.getSentenceElements().get(i).toString());
        }
        for (int i = 0; i < sentence1.getSentenceElements().size(); i++) {
            str.add(sentence1.getSentenceElements().get(i).toString());
        }
        for (int i = 0; i < sentence3.getSentenceElements().size(); i++) {
            str.add(sentence3.getSentenceElements().get(i).toString());
        }
        System.out.println(str);
        int longestOne = 0;
        String palindrome = "";
        for (String k : str) {
            if (!p2.contains(k) && isPal(k) && k.length() > longestOne) {
                longestOne = k.length();
                palindrome = k;
            }
        }
        if(palindrome.equals("")){
            System.out.println("No palindrome in input numbers");
        } else
            System.out.println("Longest palindrome is: " + palindrome);
    }
    static boolean isPal(String s) {
        return (s.equals(new StringBuilder(s).reverse().toString()));
    }
}