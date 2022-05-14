#include "pch.h"
#include "../Algorithm/src/SpecialSubject/ss.h"

TEST(letterCombinationsTest, postive) {
	vector<string> expected = {"ad","ae","af","bd","be","bf","cd","ce","cf"};
	myAlgo::LetterCombinations_17 ins;
	EXPECT_EQ(ins.letterCombinations("23"), expected);
}