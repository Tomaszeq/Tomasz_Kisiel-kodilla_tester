import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        for (int j = 0; j < 5001; j++) {
            int i = random.nextInt(31);
            System.out.println(i);

        }
    }
}