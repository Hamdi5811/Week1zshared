// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] weather = {32,25,27,40,45};
        int zipCode = 43215;
        String cityName = "columbus";
        System.out.println("City: " + cityName);
        System.out.println("Zip Code: " + zipCode);
        double sum = 0;

        for (int i = 0; i < weather.length; i++) {
            sum += weather[i];
        }

        System.out.println(sum/ weather.length);
    }



//pushed this time

}
