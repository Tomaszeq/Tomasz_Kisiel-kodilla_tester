public class Person {
    public static void main(String[] args) {

        Application application = new Application (40.5, 178);
        System.out.println(Application.getAge() + "" + Application.getHeight() + "");
        Application.checkAge(); Application.checkHeight();
    }
}
