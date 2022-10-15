//
// Created by TzashiNorpu on 7/22/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

/*
cars on left side which are moving in left direction are never going to collide,
Similarly, cars on right side which are moving right side are never going to collide.

In between them every car is going to collide.
*/
int countCollisions_2211::countCollisions(string directions) {
  int l = 0, r = directions.length() - 1;
  while (l < r && directions[l] == 'L') l++;
  while (l < r && directions[r] == 'R') r--;
  int count = 0;
  for (int i = l; i < r; i++)
    if (directions[i] != 'S')
      count++;
  return count;
}