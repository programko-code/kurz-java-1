import java.util.Scanner;

public class priklad_3_8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for ( int i = 1; i <= 5; i++ ) {
            System.out.println("Zadaj slovo");
            String slovo = s.nextLine();

            System.out.println("Zadaj číslo");
            int cislo = Integer.parseInt(s.nextLine());

            for ( int j = 1; j <= cislo; j++ ) {
                System.out.println(slovo);
            }
        }

        s.close();
    }

}
