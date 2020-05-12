import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
//C3 = 9329 % 11 = 1 => String
        /*Визначити клас навчальний заклад, який складається як мінімум з 5-и полів.*/

public class laba4 {
    public static void main(String[] args) {
        Study study = new Study();
        Study[] institutions = new Study[3];
        institutions[0] = new Study(319, "Львів", "Коновальця", "коледж", 1500);
        institutions[1] = new Study(110, "Житомир", "Гапоненка", "ліцей", 3000);
        institutions[2] = new Study(315, "Київ", "Лобановського", "школа", 5000);
        for (Study inst : institutions) {
            System.out.println(inst);
        }
        Arrays.sort(institutions, new Comp());
        Arrays.sort(institutions, Comparator.comparing(Study::getName).reversed().thenComparing(Study::getNumber));
        System.out.println("---------------------------");
        for (Study inst2 : institutions) {
            System.out.println(inst2);
        }
        System.out.println("---------------------------");
        for (int i = 0; i < institutions.length; i++) {
            System.out.println(institutions[i]);
        }
    }
}
