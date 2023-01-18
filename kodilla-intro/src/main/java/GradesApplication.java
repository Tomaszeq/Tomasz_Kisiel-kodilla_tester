public class GradesApplication {
    public static void main(String[] args) {
       Grades newGrade = new Grades();

        newGrade.add(5);
        newGrade.add(5);
        newGrade.add(4);
        newGrade.add(4);
        newGrade.add(3);
        newGrade.add(3);
        newGrade.add(4);
        newGrade.add(3);
        newGrade.add(2);
        newGrade.add(3);
        System.out.println(newGrade.getAvg());
        System.out.println(newGrade.getLastGrade());
    }
}