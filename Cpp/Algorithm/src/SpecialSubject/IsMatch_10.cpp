#include "ss.h"
bool myAlgo::IsMatch_10::isMatch(string s, string p)
{
	if (!p.size()) return !s.size();
	// b a*b
	// aa .*
	// aaa a*
	//"aab", "c*a*b"
	//"aab", "a*b"
	//"ab", "a*b"
	//"b", "a*b"
	//"b", "b"
	// aa a*
	// a a*
	// "" a*
	bool first_match =(!s.empty()&&  (s[0] == p[0] || p[0] == '.'));
	if (p.size()>=2 && p[1]=='*')
	{
		// “ª¥Œ∆•≈‰ || 0¥Œ∆•≈‰
		return (first_match && isMatch(s.substr(1),p) )|| isMatch(s,p.substr(2));
	}
	else 
	{
		return first_match && isMatch(s.substr(1),p.substr(1));
	}
}