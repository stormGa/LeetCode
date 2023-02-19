package 前缀树;

/**
 * @author Kohath
 */
public class Trie {
    /**
     * 初始化前缀树对象
     */
    class Node {
        //是否以该节点为结束的词
        boolean end;
        //孩子节点
        Node[] children = new Node[26];

    }

    Node root;

    public Trie() {
        //根节点
        root = new Node();
        root.end = false;
    }

    /**
     * 向前缀树中插入字符串 word
     *
     * @param word
     */
    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Node();
            }
            node = node.children[index];
        }
        node.end = true;
    }

    /**
     * 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false
     *
     * @param word
     * @return
     */
    public boolean search(String word) {
        Node node = searchPrefix(word);
        return node!=null && node.end;
    }

    /**
     * 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false
     *
     * @param prefix
     * @return
     */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Node searchPrefix(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}

