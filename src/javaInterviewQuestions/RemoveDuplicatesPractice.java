package javaInterviewQuestions;

public class RemoveDuplicatesPractice {
    public static void main(String[] args) {


        String str = "ABCABCCCACCBC";

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {

           String each = ""+str.charAt(i);

            if(result.contains(each)) {
                continue;


            }

             result += each;



            }






        }






    }

