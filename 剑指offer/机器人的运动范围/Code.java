package 剑指offer.机器人的运动范围;

public class Code {

    boolean[][] visited;
    int m,n;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        visited = new boolean[m][n];
        return dfs(0, 0, k);
    }

    private int dfs(int i, int j, int k) {
        if (i >= m || j >= n || visited[i][j]) {
            return 0;
        }
        if (calc(i, j) > k) {
            visited[i][j] = true;
            return 0;
        }
        visited[i][j] = true;
        return 1+dfs( i + 1, j, k) + dfs( i, j + 1, k);
    }

    private int calc(int m, int n) {
        int sum = 0;
        while (m != 0) {
            sum += m % 10;
            m /= 10;
        }
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}

