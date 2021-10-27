package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

public class LeetCode_6_208 {
    // TrieNode
    // R links to node children
    private LeetCode_6_208[] links;

    private final int R = 26;

    private boolean isEnd;

    public LeetCode_6_208() {
        links = new LeetCode_6_208[R];
    }

    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    public LeetCode_6_208 get(char ch) {
        return links[ch - 'a'];
    }

    public void put(char ch, LeetCode_6_208 node) {
        links[ch - 'a'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }

}
