#include "../header/g"

using namespace G;

bool Solution::canFinish(int numCourses, vector<vector<int>> &prerequisites) {

  Graph g = *new Graph(numCourses, prerequisites);
  return !g.get_cycled_dfs();
}