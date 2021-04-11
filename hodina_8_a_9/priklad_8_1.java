import java.util.Scanner;

public class priklad_8_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj slovo");
        String slovo = s.nextLine();

        System.out.println("Zadaj 2. slovo");
        String slovo2 = s.nextLine();

        System.out.println(slovo + " " + slovo2);

        s.close();
    }

}
