package practices;

public class Practice9 {
    public static void main(String[] args) {

        String str = "aacfffdeff";

        String result = "";

        for( int i = 0; i <= str.length()-1; i++){

            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)){
                result+=each;
            }
        }
        System.out.println(result);

    }
}
