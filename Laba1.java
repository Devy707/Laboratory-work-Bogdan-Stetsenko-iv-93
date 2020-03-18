package LabaOOP;
import java.util.Scanner;

public class Laba1 {
    /*    C2 = 9329 % 2 = 1 <=> Операція(O1) "-"
          C3 = 9329 % 3 = 2 <=> C3 = C(const) = 2
          C5 = 9329 % 5 = 4 <=> Операція(O2) "-"
          C7 = 9329 % 7 = 5 <=> (O3) "float"
    */
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите значение переменной a(i) : ");
        int firstNum = scan1.nextInt();
        System.out.println("Введите значение переменной b(j) : ");
        int secondNum = scan1.nextInt();
        System.out.println("Введите значение переменной n : ");
        int thirdNum = scan1.nextInt();
        System.out.println("Введите значение переменной m : ");
        int fourthNum = scan1.nextInt();
        float S = 0;
        int C = 2;
        if (firstNum == 2){
            System.out.println("Dividing by 0 is bad!)");
        }
        else{
        for (float i = (float)firstNum ; i <= thirdNum; i++){
            for(float j = (float)secondNum; j <= fourthNum;j ++){
                S = S + (((float)(i-j)/(i-C)));
                 }
            }
        System.out.println("Ответ : " + S);
        }
    }
}
