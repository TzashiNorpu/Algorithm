//
// Created by TzashiNorpu on 8/12/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;


int Solution::nearestExit(vector<vector<char>> &maze, vector<int> &entrance) {
  vector<vector<int>> dirs = {
          {0,  1},
          {0,  -1},
          {1,  0},
          {-1, 0}
  };
  int res = 0;
  int row = maze.size();
  int col = maze[0].size();
  vector<vector<bool>> visited(row, vector<bool>(col, false));
  queue<vector<int>> stack;
  stack.push(entrance);
  maze[entrance[0]][entrance[1]] = '+';
  visited[entrance[0]][entrance[1]] = true;
  while (!stack.empty()) {
    int steps = stack.size();
    for (int i = 0; i < steps; ++i) {
      vector<int> pos = stack.front();
      stack.pop();

      for (auto &dir: dirs) {
        int x = pos[0] + dir[0];
        int y = pos[1] + dir[1];

        /*if (x < 0 || y < 0 || x >= row || y >= col || maze[x][y] == '+')
          continue;
        //if we have reached the exit then current moves are the min moves to reach the exit
        if (x == 0 || y == 0 || x == row - 1 || y == col - 1)
          return res + 1;
        //block the cell as we have visited
        maze[x][y] = '+';*/
        if (x < 0 || x >= row || y < 0 || y >= col ||
            visited[x][y] || maze[x][y] == '+')
          continue;
        if (x == 0 || x == row - 1
            || y == 0 || y == col - 1)
          return res + 1;
        stack.push({x, y});
        visited[x][y] = true;
      }
    }
    if (stack.empty()) return -1;
    res++;
  }
  return res;
}