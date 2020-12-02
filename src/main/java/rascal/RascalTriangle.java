package rascal;

public class RascalTriangle {

    public RascalTriangle() {
    }

    public long R(int n, int m) {
        long item;
        if (m == 0 || n == m) {
            item = 1;
        } else {
            item = (R(n - 1, m - 1) * R(n - 1, m) + 1) / R(n - 2, m - 1);
        }
        return item;
    }
}
