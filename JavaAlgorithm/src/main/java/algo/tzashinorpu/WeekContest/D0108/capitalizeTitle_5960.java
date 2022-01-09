package algo.tzashinorpu.WeekContest.D0108;

public class capitalizeTitle_5960 {
    public String capitalizeTitle(String title) {
        String[] s = title.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == 1 || s[i].length() == 2) {
                s[i] = s[i].toLowerCase();
            } else {
                char[] chars = s[i].toLowerCase().toCharArray();
                chars[0] = (char) (chars[0] - 32);
                s[i] = new String(chars);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
