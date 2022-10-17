#include "../header/g"
using namespace G;
Node *Solution::cloneGraph(Node *node)
{
    unordered_map<Node *, Node *> clone_map;
    unordered_set<Node *> visited;
    function<void(Node *)> dfs = [&](Node *node) -> void
    {
        if (!node || visited.find(node) != visited.end())
            return;
        visited.insert(node);
        // if (clone_map.find(node) == clone_map.end())
        clone_map[node] = new Node(node->val);
        Node *clone_node = clone_map[node];
        for (auto &neighbor : node->neighbors)
        {
            dfs(neighbor);
            Node *clone_neighbor = clone_map[neighbor];
            clone_node->neighbors.push_back(clone_neighbor);
        }
    };
    dfs(node);
    return clone_map[node];
}