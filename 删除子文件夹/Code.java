package 删除子文件夹;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kohath
 * @desc LeetCode.1233
 */
public class Code {
    public static void main(String[] args) {
        String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> strings = new Code().removeSubfolders(folder);
        System.out.println(strings);
    }

    /**
     * 输入：folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
     * 输出：["/a","/c/d","/c/f"]
     * 解释："/a/b" 是 "/a" 的子文件夹，而 "/c/d/e" 是 "/c/d" 的子文件夹。
     *
     * @param folder
     * @return 返回剩余的文件夹
     */
    public List<String> removeSubfolders(String[] folder) {
        Trie tree = new Trie();
        int num = 0;
        //构建文件字典树
        for (String s : folder) {
            tree.insert(s, num++);
        }
        // 遍历删除
        List<String> ans = new ArrayList<>();


        dfs(tree.root, ans,folder);
        return ans;
    }


    public void dfs(Node node, List<String> ans,String[] folder) {
        if (node.flag != -1) {
            ans.add(folder[node.flag]);
            return;
        }
        for (Node n : node.children.values()) {
            dfs(n,ans,folder);
        }
    }

    class Trie {
        Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String path, int num) {
            Node node = root;
            String[] split = path.split("/");
            for (String s : split) {
                if (!node.children.containsKey(s)) {
                    node.children.put(s, new Node());
                }
                node = node.children.get(s);
            }
            node.flag = num;
        }
    }

    class Node {
        int flag = -1;
        //存孩子指针
        Map<String, Node> children = new HashMap<>();
    }
}
