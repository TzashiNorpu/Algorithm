#include <iostream>
#include <unordered_map>
using namespace std;
int main() {
	cout << "Hello World" << endl;
	unordered_map<char, int> m;
	m.insert(make_pair('c1', 1));
	if (m.find('c1') != m.end())
	{
		cout << m['c1'] << std::endl;
	}
	if (m.find('c2') != m.end())
	{
		cout << m['c2'] << std::endl;
	}
	cin.get();
}