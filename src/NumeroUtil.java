public class NumeroUtil {

    static int descobrirMaior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        /*return (a > b) ? a : b;*/
    }

    static int descobrirMaior(int a, int b,  int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        return maior;
    }

    static double descobrirMaior(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double descobrirMaior(double a, double b, double c) {
        double maior = a;

        if (b > maior) {
            maior = b;
        } if (c > maior) {
            maior = c;
        }
        return maior;
    }

}
