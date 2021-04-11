import java.util.Scanner;

public class priklad_10_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();

        for ( int i = 1; i <= retazec.length(); i++ ) {
            System.out.println(retazec.substring(0, i));
        }

        s.close();
    }

}
