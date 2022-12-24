package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {

    public void isLeapYear(int year) {
        if (isLeap(year)) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }

    private boolean isLeap(int year) {
        return year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }
}