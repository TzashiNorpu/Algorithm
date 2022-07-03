package algo.tzashinorpu.WeekContest.D220703;

import java.util.HashMap;

public class decodeMessage_6108 {
    public String decodeMessage(String key, String message) {
        int count = 0;
        char a = 'a';
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if (count == 26) break;
            if (key.charAt(i) == ' ' || map.containsKey(key.charAt(i))) continue;
            map.put(key.charAt(i), a++);
            count++;
        }
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
//            System.out.println(chars[i]);
            chars[i] = map.get(chars[i]);
        }
        return new String(chars);
    }
}
