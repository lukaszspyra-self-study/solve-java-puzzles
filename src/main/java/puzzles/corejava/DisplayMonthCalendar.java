package puzzles.corejava;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisplayMonthCalendar {

    public static void main(String[] args) {
        DisplayMonthCalendar displayMonthCalendar = new DisplayMonthCalendar();
        displayMonthCalendar.run();
    }

    private void run() {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        printOneYear(today, date, year);
    }

    private void printOneYear(LocalDate today, LocalDate date, int year) {
        while (date.getYear() == year) {

            date = printOneMonth(today, date);
            System.out.println("\n");
        }
    }

    private LocalDate printOneMonth(LocalDate today, LocalDate date) {
        int dayOfMonth = date.getDayOfMonth();
        int monthValue = date.getMonthValue();
        date = date.minusDays(dayOfMonth - 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();

        printHeader(date);
        printBlanks(value);

        while (date.getMonthValue() == monthValue) {

            System.out.printf("%3d", date.getDayOfMonth());

            markCurrentDay(today, date);

            printNewLineEndOfWeek(date);

            date = date.plusDays(1);

        }
        return date;
    }

    private void printNewLineEndOfWeek(LocalDate date) {
        if (date.getDayOfWeek().getValue() == 7) {

            System.out.println("");

        }
    }

    private void markCurrentDay(LocalDate today, LocalDate date) {
        if (date.getMonthValue() == today.getMonthValue() && date.getDayOfMonth() == today.getDayOfMonth()) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    private void printBlanks(int value) {
        for (int i = 1; i < value; i++) {

            System.out.print("     ");

        }
    }

    private void printHeader(LocalDate date) {
        String LINE = "=================================";
        System.out.println(LINE);
        System.out.printf("MONTH: %s%n", date.getMonth());
        System.out.println(LINE);
        System.out.println("MON  TUE  WED  THU  FRI  SAT  SUN");
        System.out.println(LINE);
    }

}
