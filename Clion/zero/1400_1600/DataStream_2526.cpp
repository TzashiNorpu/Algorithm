//
// Created by TzashiNorpu on 2023/6/28.
//
#include "../header/header.h"

using namespace zero;

DataStream::DataStream(int value, int k) {
  val = value;
  kmax = k;
}

bool DataStream::consec(int num) {
  if (num == val)
    valCount++;
  else
    valCount = 0;
  return valCount >= kmax;
}