import java.util.Scanner;

public class priklad_10_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();

        if ( retazec.length() > 1 ) {
            System.out.println(retazec.substring(1));
        }

        s.close();
    }

}
