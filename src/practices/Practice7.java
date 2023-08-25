package practices;

public class Practice7 {

    public static void main(String[] args) {

        String str = "anaa";

        String reversedStr = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            char each = str.charAt(i);

            reversedStr += each;
        }

        if (str.equalsIgnoreCase(reversedStr)){
            System.out.println(str +" is a palindrome");
        }else {
            System.out.println(str + " is not a palindrome");
        }

    }
}
