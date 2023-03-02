package Part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str_1 = sc.nextLine();
        System.out.print("Введите вторую строку: ");
        String str_2 = sc.nextLine();
        System.out.println(isAnogram(str_1, str_2));
    }

    public static boolean isAnogram(String str_1, String str_2){
        char[] ch1 = str_1.toCharArray();
        char[] ch2 = str_2.toCharArray();
        if(ch1.length != ch2.length)
            return false;
        else {
            java.util.Arrays.sort(ch1);
            java.util.Arrays.sort(ch2);
            for(int i = 0; i < ch1.length; i++){
                if(ch1[i] != ch2[i])
                    return false;
            }
        }
        return true;
    }
}
