public class priklad_7_2 {

    public static void main(String[] args) {
        System.out.println(obsahTrojuholnika(4, 4, 45, 45, 90));
    }

    static boolean jePravouhly(int alfa, int beta, int gamma) {
        if ( alfa + beta + gamma != 180 ) {
            return false;
        }
        else {
            if ( alfa == 90 || beta == 90 || gamma == 90 ) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    static boolean jePravouhly2(int alfa, int beta, int gamma) {
        if ( alfa + beta + gamma != 180 ) {
            return false;
        }

        if ( alfa < 1 || beta < 1 || gamma < 1 ) {
            return false;
        }

        if ( alfa == 90 || beta == 90 || gamma == 90 ) {
            return true;
        }

        return false;
    }

    static boolean jePravouhly3(int alfa, int beta, int gamma) {
        if ( alfa + beta + gamma != 180 ) {
            return false;
        }

        if ( alfa < 1 || beta < 1 || gamma < 1 ) {
            return false;
        }

        return alfa == 90 || beta == 90 || gamma == 90;
    }

    static boolean jePravouhly4(int alfa, int beta, int gamma) {
        return (alfa + beta + gamma == 180)
            && (alfa > 0 && beta > 0 && gamma > 0)
            && (alfa == 90 || beta == 90 || gamma == 90);
    }

    static boolean jePravouhly5(int alfa, int beta, int gamma) {
        return alfa + beta + gamma == 180
            && alfa > 0 && beta > 0 && gamma > 0
            && (alfa == 90 || beta == 90 || gamma == 90);
    }

    static int obsahTrojuholnika(int a, int b, int alfa, int beta, int gamma) {
        if ( jePravouhly(alfa, beta, gamma) ) {
            return a * b / 2;
        }
        else {
            return -1;
        }
    }

}
