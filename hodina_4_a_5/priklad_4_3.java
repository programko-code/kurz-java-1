import java.util.Scanner;

public class priklad_4_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj 1. číslo");
        int cislo1 = Integer.parseInt(s.nextLine());

        System.out.println("Zadaj 2. číslo");
        int cislo2 = Integer.parseInt(s.nextLine());

        if ( cislo1 * cislo2 > 1000 ) {
            System.out.println("ok");
        }
        else {
            System.out.println("nabudúce prosím zadajte väčšie čísla");
        }

        s.close();
    }

}
