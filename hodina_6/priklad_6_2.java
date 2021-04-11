public class priklad_6_2 {

    public static void main(String[] args) {
        opakuj("text", 3);
    }

    static void opakuj(String slovo, int pocet) {
        for ( int i = 1; i <= pocet; i++ ) {
            System.out.println(slovo);
        }
    }

}
