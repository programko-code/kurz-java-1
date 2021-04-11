import java.util.Scanner;

public class priklad_8_8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj číslo");
        int cislo = Integer.parseInt(s.nextLine());

        for ( int i = 1; i <= cislo; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
