import java.util.Scanner;
public class ColorQuestion {

    public static String getUserLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose color letter:");
            String letter = scanner.nextLine().trim().toUpperCase();
            if (letter.length() == 1) {
                return letter;
            }
        }
    }
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first color letter:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "R": return "Red";
                case "Y": return "Yellow";
                case "B": return "Blue";
                case "G": return "Green";
                default:
                    System.out.println("Wrong letter, try agein");
            }
        }
    }
}
