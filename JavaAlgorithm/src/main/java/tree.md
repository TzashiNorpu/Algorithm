- 链表(Linked List)的查询慢 o(N) --> 跳表
- 链表有多个指针指向不同的节点时就是数，两个指针即二叉树
    - 可以理解为链表就是特殊化的树，树是特殊化的图
- 二叉树:Binary Tree-->儿子节点有两个

- 树和图最大的区别就是有没有环
- 树的定义
    ```
    public class TreeNode{
        public int val;
        public TreeNode left,right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    ```
- 树 数据结构的必要性
    - Fibonacci 数列可以2重循环暴力求解，但是数列开展开来是树的结构--递归树
    - 棋盘的状态--下一步的状态也是树形结构

- 二叉树的遍历
    - 根-左-右 前序遍历  pre_Order
    - 左-根-右 中序遍历  in_Order
    - 左-右-根 后序遍历  post_Order
- 遍历代码--递归，循环不好写:
```
def preOrder(self,root):
    if root:
        self.traverse_path.append(root.val)
        self.preOrder(self.left)
        self.preOrder(self.right)

def inOrder(self,root):
    if root:
        self.traverse_path.append(root.val)
        self.preOrder(self.left)
        self.preOrder(self.right)

def postOrder(self,root):
    if root:
        self.preOrder(self.left)
        self.preOrder(self.right)
        self.traverse_path.append(root.val)

```
- 二叉搜索树 Binary Tree Search,Ordered Binary Tree,Sorted Binary Tree
    - 空树或者有节点
    - 左子树上的<b>所有节点</b>的值均小于它根节点的值，不仅仅是左儿子一个节点
    - 右子树上的<b>所有节点</b>的值大于它根节点的值，不仅仅是右儿子一个节点
    - 左右所有的子树都是二叉搜索树(重复性)
    - 中序排列是升序排列

- 二叉搜索树的常见操作：
    - 查询：查询值和当前节点的值进行比较，再决定往左子树还是右子树继续查找
    - 插入：插入值和当前节点值进行比较，当插入值小于上一个节点，大于下一个节点时(或下一个节点为空)进行节点插入
    - 创建：从空开始，空就是一个二叉搜索树，可以选取一个值作为根节点，然后一次调用插入操作
    - 删除
        - 叶子节点的删除：直接删除
        - 根节点的删除：删除节点后，将原删除节点的右子树中值最小的节点作(遍历右子树)为当前的节点
- 二叉搜索树查询和插入等常见操作复杂度都是log(N)，二叉搜索树只有一边的子树时退化成一个链表，常见操作的复杂度都是o(N)
