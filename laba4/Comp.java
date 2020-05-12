import java.util.Comparator;

public class Comp implements Comparator<Study> {
    @Override
    public int compare(Study v1, Study v2) {
        int difNume = v1.getName().compareTo(v2.getName());
        if (difNume == 0) {
            return v1.getName().compareTo(v2.getName());
        } else {
            return -difNume;
        }
    }

}
