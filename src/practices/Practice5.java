package practices;

public class Practice5 {
    public static void main(String[] args) {

        String str = "AABBCDDDE";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){
                unique+=each;
            }

        }
        System.out.println(unique);

    }
}
