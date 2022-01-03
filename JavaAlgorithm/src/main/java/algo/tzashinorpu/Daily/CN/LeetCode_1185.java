package algo.tzashinorpu.Daily.CN;

public class LeetCode_1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] ss = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // 19701231   Thursday
        // 19710101
        int days = 0;
        for (int i = 0; i < year - 1970 - 1; i++) {
            if (leapYear(1970 + i + 1)) {
                days += 366;
            } else {
                days += 365;
            }
        }
        int[] mDay = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; i++) {
            if (i == 1) {
                if (leapYear(year)) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += mDay[i];
            }
        }
        days += day;
        return ss[(days + 4) % 7];
    }

    private boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
