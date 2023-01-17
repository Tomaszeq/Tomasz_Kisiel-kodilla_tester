public class Grades {
    public static void main(String[] args) {

    }
    private int[] grades;
    private int size;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        int[] grade = new int[10];
        grade[0] = '5';
        grade[1] = '4';
        grade[3] = '3';
        grade[4] = '5';
        grade[5] = '4';
        grade[6] = '3';
        grade[7] = '2';
        grade[8] = '5';
        grade[9] = '4';
        grade[10] = '3';
        int grades = grade[10];
        System.out.println(grade);

    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
}