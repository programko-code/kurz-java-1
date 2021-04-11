import java.util.Scanner;

public class priklad_10_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();

        if ( retazec.length() > 4 ) {
            System.out.println(retazec.substring(0, 3));
        }
        else {
            System.out.println(retazec.toUpperCase());
            System.out.println(retazec.toLowerCase());
        }

        s.close();
    }

}
