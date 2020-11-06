import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to calculate? Type \"momentum\", \"weight\" or \"height\"");

        String whatToCalculate = scanner.nextLine();

        switch (whatToCalculate) {
            case "momentum": Methods.momentum();
            break;
            case "weight": Methods.weight();
            break;
            case "height": Methods.height();
            break;
            default: {
                System.out.println("Please enter a valid object.");
            }
        }
    }
}



