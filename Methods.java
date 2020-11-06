import java.util.Scanner;

public class Methods {

    public static void momentum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("weight?");
        double weight = scanner.nextDouble();

        System.out.println("height?");
        double height = scanner.nextDouble();

    System.out.println(weight * height * 10 + " J");
    }

    public static void weight() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ep?");
        double Ep = scanner.nextDouble();

        System.out.println("height?");
        double height = scanner.nextDouble();

    System.out.println(Ep / height * 10 + " kg");
    }

    public static void height() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Momentum?");
        double Ep = scanner.nextDouble();

        System.out.println("weight?");
        double weight = scanner.nextDouble();
    // the 10 is gravity
    System.out.println(Ep / weight * 10 + "m");
    }
}
