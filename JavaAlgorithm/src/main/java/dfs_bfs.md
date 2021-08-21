### 搜索
- 暴力搜索和朴素搜索
- 数据结构没有特点，需要遍历所有节点，每个节点访问且访问一次
- 对节点的访问顺序分为：深度优先和广度优先
- 其他的如优先级优先,更适用于业务场景，如推荐(淘宝，抖音)算法..称为启发式搜索-->估价函数和效率问题是和深度学习相关的
#### 深度优先遍历 -- DFS
- 深度优先--递归
    ```
    # 二叉树 
    def dfs(Depth First Search):
        if node in visited:
            #already visited
            return
        visited.add(node)
        #process current node
        #...
        #logic here
        dfs(left)
        dfs(right)
    ```
    ```
    # 多叉树 图
    visited = set()
    def  dfs(node,visited):
        if node in visited: # terminator
            #already visited
            return 
        visited.add(node)
        #process current node here
        ...
        for nex_node in node.children():
            if not next_node in visited:
                dfs(next_node,visited)
    ```
    ```
    # 非递归 -- 实质是用栈模拟递归
    def DFS(self,tree):
        if tree,root is None:
            return []
        visited, stack = [].[tree,root]
        while stack:
            node = stack.pop()
            visited.add(node)
            process(node)
            nodes  = generate_related_nodes(node)
            stack.push(nodes)
        # other processing work
        ...
    ```

### 广度优先遍历 -- BFS
- 采用队列遍历
- 最短路径用这个方法求解 ? 
```
def BFS(graph, start, end):
    queue = []
    queue.append([start])
    visited.add(start)
    // 会先遍历第一层，然后遍历最后一层的所有节点 ??? 
    while queue:
        node = queue.pop()
        visited.add(node)
        process(node)
        // 拿到node下一层的所有子节点
        nodes = generate_related_nodes(node)
        queue.push(nodes)
    #other processing work
    ...
```