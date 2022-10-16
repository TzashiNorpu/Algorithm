#include "../header/g.h"
using namespace G;
bool Solution::canFinish(int numCourses, vector<vector<int>> &prerequisites)
{

    Graph g = *new Graph();
    g.build_graph(numCourses, prerequisites);
    return !g.get_cycled();
}