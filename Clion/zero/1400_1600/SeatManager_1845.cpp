//
// Created by TzashiNorpu on 2023/6/16.
//
#include "../header/header.h"

using namespace zero;

SeatManager::SeatManager(int n) {
  for (int i = 0; i < n; ++i) {
    this->unreserverd.push(i + 1);
  }
}

int SeatManager::reserve() {
  int i = this->unreserverd.top();
  unreserverd.pop();
  this->reserved.insert(i);
  return i;
}

void SeatManager::unreserve(int seatNumber) {
  this->reserved.erase(seatNumber);
  this->unreserverd.push(seatNumber);
}