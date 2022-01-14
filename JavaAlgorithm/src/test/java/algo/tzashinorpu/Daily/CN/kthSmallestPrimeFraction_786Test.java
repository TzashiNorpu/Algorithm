package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class kthSmallestPrimeFraction_786Test {

    @Test
    void kthSmallestPrimeFractionHeap() {
        kthSmallestPrimeFraction_786 ins = new kthSmallestPrimeFraction_786();
        int[] arr1 = {1, 2, 3, 5};
        int k1 = 3;
        System.out.println(Arrays.toString(ins.kthSmallestPrimeFractionHeap(arr1, k1)));
    }

    @Test
    void kthSmallestPrimeFractionMerge() {
        kthSmallestPrimeFraction_786 ins = new kthSmallestPrimeFraction_786();
        int[] arr1 = {1, 2, 3, 5};
        int k1 = 3;
        System.out.println(Arrays.toString(ins.kthSmallestPrimeFractionMerge(arr1, k1)));
    }

    @Test
    void kthSmallestPrimeFractionBisection() {
        kthSmallestPrimeFraction_786 ins = new kthSmallestPrimeFraction_786();
        int[] arr1 = {1, 2, 3, 5};
        int k1 = 3;
        System.out.println(Arrays.toString(ins.kthSmallestPrimeFractionBisection(arr1, k1)));
    }
}