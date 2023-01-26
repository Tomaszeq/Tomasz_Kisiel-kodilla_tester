public class Application {
    public static void main(String[] args) {

        Person person = new Person (40.5, 178);
        System.out.println(Application.getAge() + "" + Application.getHeight() + "");
        Application.checkAge(); Application.checkHeight();
    }
}