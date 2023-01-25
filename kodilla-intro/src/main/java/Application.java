public class Application {
    private static String name = "Adam";
    private static double age = 40.5;
    private static double height = 178;

    public static void main(String[] args){

    if (name != null) {
    } else if (age > 30 && height > 160) {
            System.out.println("User is older then 30 and taller then 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}

