package algo.tzashinorpu.SpecialSubject.Top;

import java.util.HashMap;
import java.util.Map;

public class myAtoi_8 {
   /* DFA
    	        ' '	    +/-	    number	   other
    start	    start	signed	in_number	end
    signed	    end	    end	    in_number	end
    in_number	end	    end	    in_number	end
    end	        end	    end	    end	        end*/

    public int myAtoi(String s) {
        Automaton automaton = new Automaton();
        for (int i = 0; i < s.length(); i++) {
            automaton.get(s.charAt(i));
        }
        return (int) (automaton.sign * automaton.ans);
    }

    class Automaton {
        public int sign = 1;
        public long ans = 0;
        private String state = "start";
        private Map<String, String[]> table = new HashMap<>() {{
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        public void get(char c) {
            state = table.get(state)[getCol(c)];
            if (state.equals("in_number")) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
            } else if (state.equals("signed")) {
                sign = c == '+' ? 1 : -1;
            }
        }

        private int getCol(char c) {
            if (c == ' ') return 0;
            if (c == '+' || c == '-') return 1;
            if (Character.isDigit(c)) return 2;
            return 3;
        }
    }
}
