public class Person {
    public static void main(String[] args) {

        Application.Person Adam = new Application.Person("Adam", 40.5, 178);

        if (Adam.age > 30 && Adam.height > 160) {
            System.out.println( "User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}
