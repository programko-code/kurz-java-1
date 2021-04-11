import java.util.Scanner;

public class priklad_8_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj číslo");
        int cislo1 = Integer.parseInt(s.nextLine());

        System.out.println("Zadaj 2. číslo");
        int cislo2 = Integer.parseInt(s.nextLine());

        System.out.println("Súčet: " + sucet(cislo1, cislo2));
        System.out.println("Rozdiel: " + rozdiel(cislo1, cislo2));
        System.out.println("Súčin: " + sucin(cislo1, cislo2));
        System.out.println("Podiel: " + podiel(cislo1, cislo2));
        System.out.println("Zvyšok: " + zvysok(cislo1, cislo2));

        s.close();
    }

    static int sucet(int cislo1, int cislo2) {
        return cislo1 + cislo2;
    }

    static int rozdiel(int cislo1, int cislo2) {
        return cislo1 - cislo2;
    }

    static int sucin(int cislo1, int cislo2) {
        return cislo1 * cislo2;
    }

    static int podiel(int cislo1, int cislo2) {
        return cislo1 / cislo2;
    }

    static int zvysok(int cislo1, int cislo2) {
        return cislo1 % cislo2;
    }

}
