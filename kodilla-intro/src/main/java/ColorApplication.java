public class ColorApplication {
    public String drawing() {
        String userColored = ColorQuestion.getUserColor();
        switch (userColored) {
            case "R":
                System.out.println("Red");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "G":
                System.out.println("green");
                break;
        }
        return userColored;
    }
}

