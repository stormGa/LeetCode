package 图;

public class DFS {
    static boolean[][] visited;

    private void dfs(int[][] graph, int m, int n) {
        if (m >= graph.length || n >= graph[0].length || visited[m][n]) {
            return;
        }
        visited[m][n] = true;
        System.out.println(graph[m][n]);
        dfs(graph,m, n + 1);
        dfs(graph,m + 1, n);
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        visited = new boolean[graph.length][graph[0].length];
        new DFS().dfs(graph, 0, 0);
    }
}
