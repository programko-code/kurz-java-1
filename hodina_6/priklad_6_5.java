public class priklad_6_5 {

    public static void main(String[] args) {
        stvorec(4, "A");
    }

    static void stvorec(int a, String znak) {
        for ( int i = 1; i <= a; i++ ) {
            for ( int j = 1; j <= a; j++ ) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }

}
