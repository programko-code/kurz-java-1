public class priklad_8_7 {

    public static void main(String[] args) {
        System.out.println(sucetAleboSucin(10, 5));
        System.out.println(sucetAleboSucin(100, 500));
    }

    static int sucetAleboSucin(int cislo1, int cislo2) {
        if ( cislo1 * cislo2 < 1000 ) {
            return cislo1 * cislo2;
        }
        else {
            return cislo1 + cislo2;
        }
    }

}
