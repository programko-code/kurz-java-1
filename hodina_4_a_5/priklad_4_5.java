import java.util.Random;
import java.util.Scanner;

public class priklad_4_5 {

    public static void main(String[] args) {
        Random rand = new Random();
        int vygenerovane = rand.nextInt(100);

        Scanner s = new Scanner(System.in);

        for ( int i = 0; i < 20; i++ ) {
            System.out.println("Uhádni číslo");
            int cislo = Integer.parseInt(s.nextLine());

            if ( cislo > vygenerovane ) {
                System.out.println("Vygenerované číslo je menšie");
            }
            else if ( cislo < vygenerovane ) {
                System.out.println("Vygenerované číslo je väčšie");
            }
            else {
                System.out.println("Uhádol si!");
                break;
            }
        }

        s.close();
    }

}
