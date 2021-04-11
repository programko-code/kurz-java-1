import java.util.Scanner;

public class priklad_8_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj číslo");
        int cislo1 = Integer.parseInt(s.nextLine());

        System.out.println("Zadaj 2. číslo");
        int cislo2 = Integer.parseInt(s.nextLine());

        System.out.println("Súčet: " + (cislo1 + cislo2));
        System.out.println("Rozdiel: " + (cislo1 - cislo2));
        System.out.println("Súčin: " + cislo1 * cislo2);
        System.out.println("Podiel: " + cislo1 / cislo2);
        System.out.println("Zvyšok: " + cislo1 % cislo2);

        s.close();
    }

}
