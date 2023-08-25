package practices;

public class Practice2 {
    public static void main(String[] args) {

        String str = "ab1ce2ed4";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(Character.isDigit(each)){ // find out if a character is digit
                sum += Integer.parseInt(""+each); //converts digit to integer
            }

        }
        System.out.println(sum);

    }
}
