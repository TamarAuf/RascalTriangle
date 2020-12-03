package rascal;

public class RascalTriangle {

    public RascalTriangle() {
    }

    public int R(int n, int m) {

        int item = 1;

        for (int i = 0; i < (n - m); i++) {
            item += m;
        }
        return item;
    }
}
