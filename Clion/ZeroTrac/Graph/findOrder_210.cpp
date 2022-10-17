#include "../header/g"

using namespace G;

vector<int> Solution::findOrder(int numCourses, vector<vector<int>> &prerequisites) {
  Graph g = *new Graph(numCourses, prerequisites);
  vector<vector<int>> graph = *g.get_graph();
  vector<bool> visited(numCourses, false);
  vector<bool> on_path(numCourses, false);
  vector<int> res;
  bool cycled = false;
  function<void(int)> dfs = [&](int i) -> void {
      if (on_path[i])
        cycled = true;
      if (visited[i] || cycled)
        return;
      on_path[i] = true;
      visited[i] = true;
      for (auto v: graph[i])
        dfs(v);
      res.push_back(i);
      on_path[i] = false;
  };
  for (int i = 0; i < numCourses; i++)
    dfs(i);
  if (cycled)
    return vector<int>();
  reverse(res.begin(), res.end());
  return res;
}