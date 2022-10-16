#include <iostream>
#include "disjoint_set.h"

int main() {
  DS::Solution ins;

  vector<vector<char>> board = {{'X', 'X', 'X', 'X'},
                                {
                                 'X', 'O', 'O', 'X'},
                                {
                                 'X', 'X', 'O', 'X'},
                                {
                                 'X', 'O', 'X', 'X'}};
  ins.solve(board);
  return 0;
}
