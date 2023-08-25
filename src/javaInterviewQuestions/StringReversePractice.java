package javaInterviewQuestions;

public class StringReversePractice {
    public static void main(String[] args) {

        String str = "I love america";

        String strReverse = "";

        for (int i = str.length()-1; i >=0 ; i-- ){

            strReverse += str.charAt(i);
        }

        System.out.println(strReverse);


    }

}