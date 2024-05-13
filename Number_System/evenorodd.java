public class evenorodd {
    public static boolean iseven(int number) {
        if ((number & 1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 989;
        if (number <= 0) {
            System.out.println("Enter Valid Number");
        } else if (iseven(number)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
