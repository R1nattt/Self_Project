package practices;

import java.util.Scanner;

public class RemovingDuplicatesPractice {
    public static void main(String []ags){

        Scanner input = new Scanner(System.in);
        String str;
        String result = "";

        System.out.println("Please enter a string: ");
        str = input.nextLine();

        for (int i = str.length()-1; i >= 0 ; i--) {
            char each = str.charAt(i);
            result+=each;

        }
        System.out.println(result.toLowerCase());

    }
}
