package javaInterviewQuestions;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = " aaabcccdee";

        String uniques = "";

        for (int i = 0; i < str.length(); i++) {

           char each = str.charAt(i);


           if(str.indexOf(each) == str.lastIndexOf(each)){ // return the first and last occurrence of the string
               uniques += each;
           }

        }
        System.out.println(uniques);
    }

}
