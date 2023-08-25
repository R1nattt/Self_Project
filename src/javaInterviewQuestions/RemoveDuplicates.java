package javaInterviewQuestions;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "ABABABABBAC";

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {

          String each = ""+str.charAt(i);

          if(result.contains(each)){
              continue;

          }

            result += each;
        }

        System.out.println(result);




    }
}

/* write a program that can efficiently eliminate any duplicate characters present in a give String.
the solution should handel string of varying lengths effectively and preserve the original oder of characters.

Ex : "ABCABCABC"
output : abc
*/