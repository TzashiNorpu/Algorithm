#include "ss.h"
class Reverse_7
{
public:
	Reverse_7();
	~Reverse_7();
	int reverse(int x) {
		long res = 0;
		while (x != 0)
		{
			int c = x % 10;
			res = res * 10 + c;
			x = x / 10;
			if (res > INT_MAX || res < INT_MIN) return 0;
		}
		return res;
	}
private:

};

Reverse_7::Reverse_7()
{
}

Reverse_7::~Reverse_7()
{
}