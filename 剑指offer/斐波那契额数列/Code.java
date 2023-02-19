package 剑指offer.斐波那契额数列;

public class Code {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 1, result = 0;

        for (int i = 2; i < (n + 1); i++) {
            result = (p + q) % 1000000007;
            p = q;
            q = result;
        }
        return result;
    }
}
