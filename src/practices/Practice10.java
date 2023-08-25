package practices;

public class Practice10 {
    public static void main(String[] args) {

        String str = "A1B2C3D4";

        int sum = 0;

        for (int i = 0; i <= str.length()-1; i++) {

            char each = str.charAt(i);

            if(Character.isDigit(each)){

               sum += Integer.parseInt(""+each);

            }

        }
        System.out.println(sum);




    }
}
