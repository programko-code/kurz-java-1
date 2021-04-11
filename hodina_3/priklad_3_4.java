import java.util.Scanner;

public class priklad_3_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj číslo");
        int cislo = Integer.parseInt(s.nextLine());

        for ( int i = 1; i <= cislo; i = i + 2 ) {
            System.out.println(i);
        }

        s.close();
    }

}
