import java.lang.*;
public class laba551 {
    public static void main(String[] args) {
        String text = "With this example we are aaaaaaaaaaaaaa to, demonstrate how to a reverse the order of  List. \n" +
                "The ArrayList is used as  List implementation, but the same API applies to any type of List \n" +
                "implementation classes Vector etc. In short, to reverse the order of  List you should. \n";
        Text text1 = new Text(text);
        System.out.println(text1.getSentences().get(0).getSentenceElements().size());
        System.out.println(text1.getWords());
        System.out.println(text1.getPal(text1.getWords()));
    }
}