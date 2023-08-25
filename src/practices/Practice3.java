package practices;

public class Practice3 {
    public static void main(String[] args) {

        String str = "tiko";

        String reversedStr = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr += str.charAt(i);

        }

        if(reversedStr.equalsIgnoreCase(str)){
            System.out.println(str+" is a palindrome");
        } else {
            System.out.println(str+" not a palindrome");
        }

    }
}
