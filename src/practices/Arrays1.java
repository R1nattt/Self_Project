package practices;

public class Arrays1 {
    public static void main(String[] args) {

        // array = used to store multiple values in a single variable;

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }



    }
}
