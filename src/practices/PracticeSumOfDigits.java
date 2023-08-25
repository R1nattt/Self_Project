package practices;


public class PracticeSumOfDigits {
    public static void main(String[] args) {

        String str = "abc123";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);

    }
}
