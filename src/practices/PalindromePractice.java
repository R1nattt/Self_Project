package practices;

public class PalindromePractice {
    public static void main(String[] args) {

        String str = "level";

        String strPalindrome = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            char each = str.charAt(i);
            strPalindrome+=each;
        }
        if(str.equalsIgnoreCase(strPalindrome)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }



    }
}
