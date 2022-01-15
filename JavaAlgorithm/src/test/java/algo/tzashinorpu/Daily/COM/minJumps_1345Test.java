package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class minJumps_1345Test {

    @Test
    void minJumpsBfs() {
        minJumps_1345 ins = new minJumps_1345();
        int[] arr1 = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        System.out.println(ins.minJumpsBfs(arr1));

        int[] arr2 = {7, 6, 9, 6, 9, 6, 9, 7};
        System.out.println(ins.minJumpsBfs(arr2));


        int[] arr3 = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        System.out.println(ins.minJumpsBfs(arr3));
        int[] arr4 = {7};
        System.out.println(ins.minJumpsBfs(arr4));

        int[] arr5 = {1, 7, 7, 7, 7, 7, 7, 11};
        System.out.println(ins.minJumpsBfs(arr5));

        int[] arr6 = {7, 7, 7, 7, 7, 7, 7, 11};
        System.out.println(ins.minJumpsBfs(arr6));

        int[] arr7 = {11, 7, 7, 7, 7, 7, 7, 7};
        System.out.println(ins.minJumpsBfs(arr7));
    }
}