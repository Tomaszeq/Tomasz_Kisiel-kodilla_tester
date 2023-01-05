public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(leap = true);
                } else
                    System.out.println(leap = false);
            } else
                System.out.println(leap = true);
        } else
            System.out.println(leap = false);
    }
}
