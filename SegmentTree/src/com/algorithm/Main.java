package com.algorithm;

public class Main {

    public static void main(String[] args) {
        long arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        SegmentTree segmentTree = new SegmentTreeRangeMinimumQuery(arr, arr.length, Long.MAX_VALUE);
        segmentTree.build();
        System.out.println(segmentTree.rangeQuery(3, 6));
        System.out.println(segmentTree.rangeQuery(1, 3));
        System.out.println(segmentTree.rangeQuery(7, 8));
        segmentTree.update(1, 10);
        System.out.println(segmentTree.rangeQuery(1, 3));
        segmentTree.update(4, -1);
        System.out.println(segmentTree.rangeQuery(4, 4));

        long brr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        segmentTree = new SegmentTreeRangeSum(brr, brr.length, 0);
        segmentTree.build();
        System.out.println(segmentTree.rangeQuery(3, 6));
        System.out.println(segmentTree.rangeQuery(1, 3));
        System.out.println(segmentTree.rangeQuery(7, 8));
        segmentTree.update(1, 10);
        System.out.println(segmentTree.rangeQuery(1, 3));
        segmentTree.update(4, -1);
        System.out.println(segmentTree.rangeQuery(4, 4));

    }
}
