public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                    System.out.println(leap);
                } else
                    leap = false;
                    System.out.println(leap);
            } else
                leap = true;
                System.out.println(leap);
        } else
            leap = false;
            System.out.println(leap);
    }
}
