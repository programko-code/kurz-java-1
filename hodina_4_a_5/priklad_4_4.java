import java.util.Random;
import java.util.Scanner;

public class priklad_4_4 {

    public static void main(String[] args) {
        Random rand = new Random();
        int vygenerovane = rand.nextInt(10);

        Scanner s = new Scanner(System.in);

        System.out.println("Uhádni číslo");
        int cislo = Integer.parseInt(s.nextLine());

        if ( cislo > vygenerovane ) {
            System.out.println("Vygenerované číslo je menšie");
            System.out.println("Bolo to číslo " + vygenerovane);
        }
        else if ( cislo < vygenerovane ) {
            System.out.println("Vygenerované číslo je väčšie");
            System.out.println("Bolo to číslo " + vygenerovane);
        }
        else {
            System.out.println("Uhádol si!");
        }

        s.close();
    }

}
