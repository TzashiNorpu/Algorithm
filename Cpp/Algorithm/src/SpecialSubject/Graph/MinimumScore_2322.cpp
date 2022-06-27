#include "graph.h"
#include <set>
#include <algorithm>
// ��ʱ
int myAlgo::MinimumScore_2322::minimumScore(vector<int>& nums, vector<vector<int>>& edges) {
	int n = nums.size();
	int m = edges.size();
	// nums = [1,5,5,4,11], edges = [[0,1],[1,2],[1,3],[3,4]]
	vector<vector<int>> graph;
	for (int i = 0; i < n; i++) {
		graph.push_back(vector<int>());
	}
	// ÿ���ڵ�Ķ�
	vector<int> degree;
	for (int i = 0; i < n; i++) {
		degree.push_back(0);
	}

	for (vector<int> e : edges) {
		int x = e[0], y = e[1];
		graph[x].push_back(y);
		graph[y].push_back(x);
		degree[x]++;
		degree[y]++;
	}
	// ���нڵ�� xor
	int V = 0;
	// ÿ���ڵ�� xor
	vector<int> A(nums);
	// leaf nodes
	vector<int> dq;
	set<int> seen;
	vector<set<int>> children;
	for (size_t i = 0; i < n; i++)
	{
		children.push_back(set<int>());
	}
	for (size_t i = 0; i < n; i++)
	{
		V = V ^ nums[i];
		// leaf node
		if (degree[i] == 1)
		{
			dq.push_back(i);
			seen.insert(i);
		}
	}

	while (!dq.empty())
	{
		int child = dq.back();
		dq.pop_back();
		for (int pa : graph[child]) {
			if (seen.count(pa) == 0) {
				children[pa].insert(child);
				// �����ӽڵ�Ľڵ�Ҳ����
				set<int> tmp = children[child];
				for (auto it = tmp.cbegin(); it != tmp.cend(); it++)
				{
					children[pa].insert(*it);
				}
				A[pa] ^= A[child];
			}
			// Ҷ�ӽڵ�� xor ������Ϻ����������丸�ڵ�� xor
			degree[pa]--;
			if (degree[pa] == 1) {
				seen.insert(pa);
				dq.push_back(pa);
			}
		}
	}
	int ans = INT_MAX;
	// i ֻ�� m - 1 ����Ϊ������� m �� j ��û�а취ѡ��ڶ��� remove �ı�
	for (size_t i = 0; i < m - 1; i++) {
		for (size_t j = i + 1; j < m; j++) {
			// Let a, c be the lower break points
			int a = edges[i][0], b = edges[i][1];
			int c = edges[j][0], d = edges[j][1];
			// ��� b �� a �� children
			if (children[a].count(b) != 0) {
				int tmp = b;
				b = a;
				a = tmp;
			}
			if (children[c].count(d) != 0) {
				int tmp = c;
				c = d;
				d = tmp;
			}
			// 3 cases: c is a's child, a is c's child, or a and b are two independent subtrees.
			vector<int> t1;
			if (children[a].count(c) != 0)
			{
				// c �� a �� child
				t1 = { A[c],A[a] ^ A[c],V ^ A[a] };
			}
			else if (children[c].count(a) != 0) {
				// a �� c �� child
				t1 = { A[a],A[c] ^ A[a],V ^ A[c] };
			}
			else
			{
				t1 = { A[a],A[c],V ^ A[a] ^ A[c] };
			}
			ans = min(ans, *max_element(t1.begin(), t1.end()) - *min_element(t1.begin(), t1.end()));
		}
	}
	return ans;
}
