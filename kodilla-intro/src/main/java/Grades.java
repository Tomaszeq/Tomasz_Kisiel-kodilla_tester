public class Grades {

    private int[] grades;
    private int size;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;

        int[] grades = {5, 5, 4, 4, 3, 3, 4, 3, 2, 3};
        double sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        sum /= grades.length;
        System.out.println("Średnia ocen: " + sum);
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
        System.out.println("ostatnia ocena: " + value);
    }
}