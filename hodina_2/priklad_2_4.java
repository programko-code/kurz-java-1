import java.util.Scanner;

public class priklad_2_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj slovo");
        String slovo = s.nextLine();

        System.out.println("Zadaj číslo");
        int cislo = Integer.parseInt(s.nextLine());

        for ( int i = 1; i <= cislo - 1; i++ ) {
            System.out.print(slovo + ", ");
        }

        System.out.print(slovo);

        s.close();
    }

}
