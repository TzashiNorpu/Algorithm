#pragma once
#include <string>
#include <unordered_map>
#include <stack>
#include <math.h>
using namespace std;
namespace myAlgo {
	class IsValid_20 {
	public:
		bool isValid(string s);
	};
	class Min_Stack {
		int INIT_SIZE = 100;
		int* elements=new int[INIT_SIZE];
		int size;
		int min;    /* 维护一个最小值 */
		int minCount;
	public:
		void push(int val);
		void pop();
		int top();
        int getMin();
	};
	
}
