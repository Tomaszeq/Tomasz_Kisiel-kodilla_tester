import java.util.Random;
public class RandomNumbers {

    public static int min = 500;
    public static int max;


    public static void main(String[] args) {
        generate();
        System.out.println(getMin());
        System.out.println(getMax());
    }
    public static int getMin() {
        return min;
    }
    public static int getMax() {
        return max;
    }
    public static void generate() {
        Random random = new Random();
        int sum = 0;
        while (sum <= 50) {

            int i = random.nextInt(31);
            sum = sum + i;
            System.out.println(sum);

            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
    }
}