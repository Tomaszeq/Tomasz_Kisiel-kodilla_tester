public class Application {
    public static void main(String[] args) {

        Person adam = new Person (40.5,178);
        System.out.println(Person.getAge() + "" + Person.getHeight() + "");
        Person.checkAge(); Person.checkHeight();
    }
}