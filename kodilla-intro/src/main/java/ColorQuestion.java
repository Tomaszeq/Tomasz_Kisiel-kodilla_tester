import java.util.Scanner;
public class ColorQuestion {

    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first color letter(R, Y, B, G):");
            String colr = scanner.nextLine().trim().toUpperCase();
            switch (colr) {
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
