package com.algorithm;

public class SegmentTreeRangeSum extends SegmentTree {
    SegmentTreeRangeSum(long[] arr, int size, long NOTFOUND) {
        super(arr, size, NOTFOUND);
    }

    @Override
    public long mergeTree(long a, long b) {
        return a+b;
    }
}
