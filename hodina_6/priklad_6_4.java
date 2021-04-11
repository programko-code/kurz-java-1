public class priklad_6_4 {

    public static void main(String[] args) {
        stvorec(4);
    }

    static void stvorec(int a) {
        for ( int i = 1; i <= a; i++ ) {
            for ( int j = 1; j <= a; j++ ) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
