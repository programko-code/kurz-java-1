import java.util.Scanner;

public class priklad_2_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj číslo");
        int n = Integer.parseInt(s.nextLine());

        for ( int i = 1; i <= n; i++ ) {
            System.out.print(i + " ");
        }

        s.close();
    }

}
