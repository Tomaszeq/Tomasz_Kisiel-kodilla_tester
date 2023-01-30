public class ColorAdvApplication {
    public static void main(String[] args) {
        ColorQuestion question = new ColorQuestion();
        String result = question.getUserColor();
        System.out.println("Result: " + result);
    }
}
