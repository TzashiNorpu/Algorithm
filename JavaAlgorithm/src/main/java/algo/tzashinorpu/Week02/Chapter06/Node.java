package algo.tzashinorpu.Week02.Chapter06;

import java.util.List;

public class Node {
    public int val;
    public List<Node> childrens;
    public Node(){}
    public Node(int _val,List<Node> _childrens){
        val = _val;
        childrens = _childrens;
    }
}
