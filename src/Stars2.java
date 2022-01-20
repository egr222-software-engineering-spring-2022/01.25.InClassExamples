public class Stars2 {
    public static void main(String[] args) {
        line(13);
        line(7);
        line(35);
//        box10x3();
//        box5x4();
    }

    public static void line(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void box10x3() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("*");
        for (int i = 1; i <= 8; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void box5x4() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("*");
        for (int i = 1; i <= 3; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        System.out.print("*");
        for (int i = 1; i <= 3; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
