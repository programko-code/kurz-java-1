import java.util.Scanner;

public class priklad_8_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj slovo");
        String slovo = s.nextLine();

        if ( slovo.equals("leto") ) {
            System.out.println("na leto sa tesim");
        }
        else {
            System.out.println("jedine, na co sa tesim, je leto...");
        }

        s.close();
    }

}
