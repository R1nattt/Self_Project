package javaInterviewQuestions;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Cydeo School";


        String reverseStr = "";

        for (int i = str.length()-1; i >= 0; i-- ){

            reverseStr += str.charAt(i);

        }

        System.out.println(reverseStr);





    }

}


/* write a program that can reverse a given string. The solution should accurately preserve the character order,
including whitespace and special characters, while maintaining case sensitivity. In addition, the solution should
handle String of varying lengths.

   Ex:
   str = "Java Programing

   output : " gnimarorP avaJ"


 */
