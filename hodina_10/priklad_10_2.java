import java.util.Scanner;

public class priklad_10_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj reťazec");
        String retazec = s.nextLine();
        System.out.println(retazec.replace("Matej", "#"));

        s.close();
    }

}
