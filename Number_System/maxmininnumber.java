public class maxmininnumber {
    public static void findMinMax(int number) {
        int duplicate = number;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        System.out.println(mini+", "+maxi);
        while (duplicate != 0) {
            int lastdigit = duplicate % 10;
            mini = Math.min(lastdigit, mini);
            maxi = Math.max(lastdigit, maxi);
            duplicate = duplicate / 10;
        }
        System.out.println("Maximum digit: "+maxi+" Minimum digit: "+mini);
    }
    public static void main(String[] args) {
        int number = 3456782;
        findMinMax(number);
    }
}
