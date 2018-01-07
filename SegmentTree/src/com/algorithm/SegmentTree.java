package com.algorithm;

public class SegmentTree {

    long Tree[];

    long arr[];

    int size;

    SegmentTree(long arr[], int size) {

        this.Tree = new long[4 * size];
        this.arr = arr;
        this.size = size;
    }

    private void mergeTree(int idx) {

        Tree[idx] = Long.max(Tree[(2 * idx + 1)], Tree[(2 * idx + 2)]);

    }

    private void buildTree(int low, int high, int idx) {

        if (low == high) {
            Tree[idx] = arr[low];
        } else {

            int mid = (low + high) / 2;
            buildTree(low, mid, 2 * idx + 1);
            buildTree(mid + 1, high, 2 * idx + 2);
            mergeTree(idx);
        }


    }

    void build() {
        buildTree(0, size - 1, 0);
    }

    private long rangeQueryCalculate(int low, int high, int idx, int clow, int chigh) {
        if (high < clow || low > chigh)
            return Long.MIN_VALUE;
        if (clow >= low && chigh <= high)
            return Tree[idx];
        else {

            int cmid = (clow + chigh) / 2;
            return Long.max(rangeQueryCalculate(low, high, 2 * idx + 1, clow, cmid), rangeQueryCalculate(low, high, 2 * idx + 2, cmid + 1, chigh));
        }

    }

    long rangeQuery(int low, int high) {

        return rangeQueryCalculate(low, high, 0, 0, size - 1);


    }

    private void updateQuery(int index, long value, int idx, int low, int high) {
        if (low == high) {

            Tree[idx] = value;
            arr[index] = value;
        } else if (low <= index && high >= index) {

            int mid = (low + high) / 2;
            updateQuery(index, value, 2 * idx + 1, low, mid);
            updateQuery(index, value, 2 * idx + 2, mid + 1, high);
            mergeTree(idx);
        }


    }

    void update(int index, long value) {
        updateQuery(index, value, 0, 0, size - 1);

    }
}
