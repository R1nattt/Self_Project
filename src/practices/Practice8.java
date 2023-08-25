package practices;

public class Practice8 {
    public static void main(String[] args) {

        String str = "AABBCCDD";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String each = ""+str.charAt(i);

            if(result.contains(each)){
                continue;
            }
            result+=each;
        }

        System.out.println(result );

    }
}
