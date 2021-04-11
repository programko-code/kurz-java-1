import java.util.Scanner;

public class priklad_10_8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();

        System.out.println("Zadaj pismeno");
        char znak = s.nextLine().charAt(0);

        System.out.println(obsahuje(retazec, znak));

        s.close();
    }

    static int obsahuje(String slovo, char znak) {
        for ( int i = 0; i < slovo.length(); i++ ) {
            if ( slovo.charAt(i) == znak ) {
                return i;
            }
        }

        return -1;
    }

}
