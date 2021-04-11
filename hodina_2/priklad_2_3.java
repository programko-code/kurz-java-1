import java.util.Scanner;

public class priklad_2_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj slovo");
        String slovo = s.nextLine();

        for ( int i = 1; i <= 9; i++ ) {
            System.out.print(slovo + ", ");
        }

        System.out.print(slovo);

        s.close();
    }

}
