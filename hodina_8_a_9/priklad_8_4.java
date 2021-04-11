import java.util.Scanner;

public class priklad_8_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj číslo");
        int cislo = Integer.parseInt(s.nextLine());

        System.out.println("Zadaj slovo");
        String slovo = s.nextLine();

        for ( int i = 1; i <= cislo; i++ ) {
            System.out.println(slovo);
        }

        s.close();
    }

}
