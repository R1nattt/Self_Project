package practices;

public class Practice4 {
    public static void main(String[] args) {

        String str = "AAABBBCCC";

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            String each = ""+str.charAt(i);

            if (result.contains(each)){
                continue;
            }else{
                result += each;
            }
        }

        System.out.println(result);
    }
}
