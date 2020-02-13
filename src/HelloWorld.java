import java.util.Scanner;

class HelloWorld {
    private static Scanner keyb = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Hello world!\n");
        System.out.println("Press 'Enter' to stop.");
        keyb.nextLine();
    }
}
