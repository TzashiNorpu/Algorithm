#include "../header/g"

using namespace G;

vector<vector<int>> Solution::allPathsSourceTarget(vector<vector<int>> &graph)
{
    vector<vector<int>> res;
    int n = graph.size();
    vector<int> path;
    function<void(vector<int> &, int, vector<vector<int>> &)> dfs =
        [&](vector<int> &path, int v, vector<vector<int>> &g) -> void
    {
        path.push_back(v);
        if (v == n - 1)
            res.push_back(path);
        for (auto &s : graph[v])
            dfs(path, s, graph);
        path.pop_back();
    };
    dfs(path, 0, graph);
    return res;
}