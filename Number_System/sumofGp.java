public class sumofGp {
    public static double sumApTilln(int n, int a, double r) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (a * Math.pow(r, i));
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 3, a = 1;
        double r = 0.5d;
        System.out.println("Sum of GP is: " + sumApTilln(n, a, r));
    }
}
