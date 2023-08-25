package practices;

public class Practice6 {
    public static void main(String[] args) {

        String str = "Rinat Akrem";

        String reversedString = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            char each = str.charAt(i);

            reversedString += each;

        }
        System.out.println(reversedString);
    }
}
