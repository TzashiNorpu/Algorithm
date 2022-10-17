#include <iostream>
#include "ZeroTrac/header/g"

int main()
{
  G::Solution ins;

  vector<vector<char>> board = {
      {'1', '1', '1', '1', '0'},
      {'1', '1', '0', '1', '0'},
      {'1', '1', '0', '0', '0'},
      {'0', '0', '0', '0', '0'}};
  int res = ins.numIslands(board);
  printf("res=%d\n", res);
  return 0;
}
