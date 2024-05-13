public class sumofAp {
    public static int sumApTilln(int n, int a, int d){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum+(a + (i*d));
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 8, a = -2 , d = 5;
        System.out.println("Sum of AP is: "+sumApTilln(n, a, d));
    }
}
