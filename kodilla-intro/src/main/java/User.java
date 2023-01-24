public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int averageAge() {
        return this.averageAge();
    }

    public static void main(String[] args) {


        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};


        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getAge();
        }
        int averageAge = sum / users.length;

        System.out.println(sum);
        System.out.println("Średnia wieku: " + averageAge);

        for (int i = 0; i < users.length; i++) {

            if (users[i].getAge() < averageAge) {
                System.out.println(users[i].getAge());


            }
        }
    }
}


