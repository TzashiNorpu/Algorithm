package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class myAtoi_8 {
    // fsm
    /*
                 -/+      number  ' '       other
      start      signed   number  start     end
      signed     end      number  end       end
      number     end      number  end       end
      end        end      end     end       end
     */
    public int myAtoi(String s) {
        FSM fsm = new FSM();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            fsm.feed(c);
        }
        return (int) (fsm.RES * fsm.SIGNED);
    }

    private static class FSM {
        private long RES = 0;
        private int SIGNED = 1;
        private String state = "start";
        private final Map<String, String[]> transformation = new HashMap<>() {{
            put("start", new String[]{"signed", "number", "start", "end"});
            put("signed", new String[]{"end", "number", "end", "end"});
            put("number", new String[]{"end", "number", "end", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        private void feed(char c) {
            if (state.equals("end")) return;
            if (state.equals("start") && (c == '-' || c == '+')) {
                state = "signed";
                if (c == '-') SIGNED = -1;
            } else if (Character.isDigit(c)) {
                state = transformation.get(state)[1];
                RES = RES * 10 + (c - '0');
                RES = SIGNED == 1 ? Math.min(RES, Integer.MAX_VALUE) : Math.min(RES, -(long) Integer.MIN_VALUE);
            } else if (c == ' ') {
                state = transformation.get(state)[2];
            } else state = transformation.get(state)[3];
        }
    }
}
