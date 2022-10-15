#include "../header/1500_1600.h"

using namespace ZeroTrac;

CombinationIterator_1286::CombinationIterator_1286(string characters, int combinationLength) {
  reverse(characters.begin(), characters.end());
  this->key = characters;
  this->curr = (1 << key.size()) - 1;
  this->sz = combinationLength;
}

// 二进制编码中1的个数
int countOne(int n) {
  int count = 0;
  while (n != 0) {
    count++;
    n = (n - 1) & n;
  }
  return count;
}

string CombinationIterator_1286::next() {
  while (curr >= 0 && countOne(curr) != sz) {
    curr--;
  }

  string res;
  for (int i = 0; i < key.size(); ++i) {
    if ((curr & (1 << i)) >> i) {
      res = key[i] + res;
    }
  }
  curr--;

  return res;
}

bool CombinationIterator_1286::hasNext() {
  while (curr >= 0 && countOne(curr) != sz) {
    curr--;
  }
  if (curr < 0) {
    return false;
  }
  return true;
}
