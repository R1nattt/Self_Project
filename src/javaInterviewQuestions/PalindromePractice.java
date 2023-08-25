package javaInterviewQuestions;

public class PalindromePractice {

    public static void main(String[] args) {

       String str = "level";

       String reversedStr = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversedStr += str.charAt(i);

        }
        System.out.println(reversedStr);

        if(reversedStr.equalsIgnoreCase(str)){
            System.out.println("The give String is palindrome");
        }else {
            System.out.println("Give string is not a palindrome");
        }

    }
}
