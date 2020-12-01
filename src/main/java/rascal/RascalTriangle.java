package rascal;


public class RascalTriangle {
    private int item;

    public RascalTriangle() {
    }

    public int R(int n, int m) {
        if (m == 0 || n == m) {
            item = 1;
        } else {
            item = (R(n - 1, m - 1) * R(n - 1, m) + 1) / R(n - 2, m - 1);
        }

        return item;
    }
}
