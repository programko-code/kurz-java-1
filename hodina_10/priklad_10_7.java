import java.util.Scanner;

public class priklad_10_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();

        System.out.println("Zadaj znak");
        String znak = s.nextLine();

        System.out.println(obsahuje(retazec, znak));

        s.close();
    }

    static boolean obsahuje(String slovo, String znak) {
        return slovo.contains(znak);

        /*if (slovo.contains(znak)) {
            return true;
        } else {
            return false;
        }*/
    }

}
