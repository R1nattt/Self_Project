package javaInterviewQuestions;

public class SumOfDigits {
    public static void main(String[] args) {

        String str = "A1B2C3D4";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (Character.isDigit(each)){  // (wrapper class) verify if a character is a digit

                sum += Integer.parseInt(""+each); // the digit character will be converted to a integer

            }

        }

        System.out.println(sum);

    }
}
