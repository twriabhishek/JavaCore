public class switchcase3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        switch (x) {
            case 1:
                System.out.println("x is 1.");
                switch (y) {
                    case 1:
                        System.out.println("y is 1.");
                        break;
                    default:
                        System.out.println("y is not 1.");
                }
                break;
            default:
                System.out.println("x is not 1.");
        }
    }
}
