package com.algorithm;

public class SegmentTreeRangeMinimumQuery extends SegmentTree {


    public SegmentTreeRangeMinimumQuery(long[] arr, int size, long NOTFOUND) {
        super(arr, size, NOTFOUND);
    }

    @Override
    public long mergeTree(long a, long b) {
        return Long.min(a,b);
    }

}
