import java.util.Scanner;

public class priklad_4_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Zadaj farbu");
        String farba = s.nextLine();

        if ( farba.equals("zelena") ) {
            System.out.println("toto je moja obľúbená farba");
        }

        s.close();
    }

}
