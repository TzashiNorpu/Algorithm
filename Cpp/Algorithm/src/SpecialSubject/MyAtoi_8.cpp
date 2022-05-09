#include "ss.h"

class Automaton
{
public:
	Automaton();
	~Automaton();
	int sign = 1;
	long ans = 0;
	void get(char c) {
		state = table[state][getCol(c)];
		if (state == "number")
		{
			ans = ans * 10 + c - '0';
			ans = sign == 1 ? min(ans, (long)INT_MAX) : min(ans, -1 * (long)INT_MIN);
		}
		if (state == "signed" && c == '-')
		{
			sign = -1;
		}
	}

private:
	string state = "start";
	unordered_map<string, vector<string>> table = {
		{"start", {"start", "signed", "number", "end"}},
		{"signed", {"end", "end", "number", "end"}},
		{"number", {"end", "end", "number", "end"}},
		{"end", {"end", "end", "end", "end"}}
	};
	int getCol(char c)
	{
		if (isspace(c)) return 0;
		if (c == '+' || c == '-') return 1;
		if (isdigit(c)) return 2;
		return 3;
	}

};

Automaton::Automaton()
{
}

Automaton::~Automaton()
{
}
class MyAtoi_8 {
private:
	/*
				" "				"+"/"-"       number        other
	started		started			signed		  number		end
	signed		end				 end		  number		end
	number		end				 end          number		end
	end			end				 end          end			end
	*/
public:
	int myAtoi(string s) {
		Automaton automaton;
		for (char c : s)
		{
			automaton.get(c);
		}
		return automaton.sign * automaton.ans;
	}
};
