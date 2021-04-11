import java.util.Scanner;

public class priklad_10_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();

        System.out.println("Zadaj číslo");
        int cislo = Integer.parseInt(s.nextLine());

        System.out.println(retazec.substring(0, cislo));

        s.close();
    }

}
