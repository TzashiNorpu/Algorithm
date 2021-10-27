package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

class Trie {
    private LeetCode_6_208 root;

    public Trie() {
        root = new LeetCode_6_208();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        LeetCode_6_208 node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new LeetCode_6_208());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    // search a prefix or whole key in trie and
    // returns the node where search ends
    private LeetCode_6_208 searchPrefix(String word) {
        LeetCode_6_208 node = root;
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsKey(curLetter)) {
                node = node.get(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        LeetCode_6_208 node = searchPrefix(word);
        return node != null && node.isEnd();
    }


    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        LeetCode_6_208 node = searchPrefix(prefix);
        return node != null;
    }

    public static void main(String[] args) {
        Trie test = new Trie();
        test.insert("hel");
        test.insert("mama");
        System.out.println(test.searchPrefix("he").isEnd());
        System.out.println(test.searchPrefix("hel").isEnd());
    }

}

