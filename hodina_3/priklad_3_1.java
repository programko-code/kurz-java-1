import java.util.Scanner;

public class priklad_3_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj slovo");
        String slovo = s.nextLine();

        System.out.println("Zadaj druhé slovo");
        String slovo2 = s.nextLine();

        for ( int i = 1; i <= 5; i++ ) {
            System.out.println(slovo);
        }

        System.out.println("Medzera medzi cyklami");

        for ( int i = 1; i <= 5; i++ ) {
            System.out.println(slovo2);
        }

        s.close();
    }

}
