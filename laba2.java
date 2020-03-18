import java.lang.*;
import java.io.*;
import java.util.*;
//C3 = 9329 % 3 = 2 => String
//C17 = 9329 % 17 = 13 =>
        /*В заданому тексті знайти підрядок максимальної довжини, що є паліндромом,
        тобто читається однаково зліва на право та з права на ліво.*/

public class laba2 {
    public static void main(String[] args) {
        System.out.println("Input numbers divided by space");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] SS = str.split(" ");
        check(SS);

    }

    static void check(String[] SS) {
        int longestOne = 0;
        String palindrome="";
        for(String s: SS){

            if(isPal(s)&&s.length()>longestOne){
                longestOne=s.length();
                palindrome = s;
            }

        }
        if(palindrome.equals("")){
            System.out.println("No palindrome in input numbers");
        } else
            System.out.println("Longest palindrome is: "+palindrome);
    }

    static boolean isPal(String s){
        return (s.equals(new StringBuilder(s).reverse().toString()));
    }
}







