#include "pch.h"
#include "../Algorithm/src/Chapter4/chapter4.h"
namespace myTest {
	TEST(isValid, postive) {
		myAlgo::IsValid_20 ins;
		EXPECT_EQ(ins.isValid("({})"), true);
		EXPECT_EQ(ins.isValid(")"), false);
	}

}


