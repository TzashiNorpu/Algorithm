#include "header.h"
using namespace ZeroTrac;
#define ll long long
int Solution::maxProduct(TreeNode *root)
{
    ll MOD = 1e9 + 7;
    function<int(TreeNode *)> calcSum = [&](TreeNode *node) -> int
    {
        if (!node)
            return 0;
        return node->val + calcSum(node->left) + calcSum(node->right);
    };
    int totalSum = calcSum(root);

    ll res = INT_MIN;
    function<ll(TreeNode * node)> dfs = [&](TreeNode *node) -> ll
    {
        if (!node)
            return 0;
        ll left = dfs(node->left);
        ll right = dfs(node->right);
        res = max(res, max((totalSum - left) * left, (totalSum - right) * right));
        return left + right + node->val;
    };

    dfs(root);

    return res % MOD;
}
