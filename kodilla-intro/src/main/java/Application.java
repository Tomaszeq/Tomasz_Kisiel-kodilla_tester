public class Application {

    private static String name;
    private static double age;
    private static double height;

    public Application (double age, double height) {

        this.name = name;
        this.age = age;
        this.height = height;

    }

    public static String getName() {
        return name;
    }

    public static double getAge() {
        return age;
    }

    public static double getHeight() {
        return height;
    }

    public static void checkAge() {
        if (age > 30) {
            System.out.println("User is older than 30");
        } else {
            System.out.println("User is 30 (or younger)");
        }
    }

    public static void checkHeight() {
        if (height > 160) {
            System.out.println("User is taller then 160");
        } else {
            System.out.println("user is 160 (or shorter");
        }
    }
}
