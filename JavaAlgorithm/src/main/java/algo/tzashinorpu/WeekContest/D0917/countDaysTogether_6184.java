package algo.tzashinorpu.WeekContest.D0917;

public class countDaysTogether_6184 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
//        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int arriveAliceDays = getdays(Integer.parseInt(arriveAlice.substring(0, 2)))
                + Integer.parseInt(arriveAlice.substring(3));
        int leaveAliceDays = getdays(Integer.parseInt(leaveAlice.substring(0, 2)))
                + Integer.parseInt(leaveAlice.substring(3));
        int arriveBobDays = getdays(Integer.parseInt(arriveBob.substring(0, 2)))
                + Integer.parseInt(arriveBob.substring(3));
        int leaveBobDays = getdays(Integer.parseInt(leaveBob.substring(0, 2)))
                + Integer.parseInt(leaveBob.substring(3));
        if ((leaveAliceDays >= arriveBobDays && arriveAliceDays <= leaveBobDays) || (leaveBobDays >= arriveAliceDays && arriveBobDays <= leaveAliceDays))
            return Math.abs(Math.min(leaveBobDays, leaveAliceDays) - Math.max(arriveAliceDays, arriveBobDays)) + 1;
        return 0;
    }

    private int getdays(int month) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int x = 0;
        for (int i = 0; i < month - 1; i++) {
            x += days[i];
        }
        return x;
    }
}
