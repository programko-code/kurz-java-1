import java.util.Scanner;

public class priklad_4_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj heslo");
        String heslo1 = s.nextLine();

        System.out.println("Zadaj heslo znovu");
        String heslo2 = s.nextLine();

        if ( !heslo1.equals(heslo2) ) {
            System.out.println("heslá musia byť rovnaké");
        }

        s.close();
    }

}
