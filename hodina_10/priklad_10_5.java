import java.util.Scanner;

public class priklad_10_5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();

        if ( retazec.length() > 1 ) {
            System.out.println(retazec.length());
            System.out.println(retazec.charAt(0));
            System.out.println(retazec.charAt(retazec.length() - 1));
        }

        s.close();
    }

}
