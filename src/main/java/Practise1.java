import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printHelloName();
    }
    public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}