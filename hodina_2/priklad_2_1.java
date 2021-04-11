import java.util.Scanner;

public class priklad_2_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj vstup");
        String input = s.nextLine();

        System.out.println("Načítaný vstup je " + input);

        s.close();
    }

}
