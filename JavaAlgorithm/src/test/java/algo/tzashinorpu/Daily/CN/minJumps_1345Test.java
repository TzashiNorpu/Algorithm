package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class minJumps_1345Test {

    @Test
    void minJumps() {
        minJumps_1345 ins = new minJumps_1345();
        int[] arr1 = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        System.out.println(ins.minJumps(arr1));
        //[7,7,2,1,7,7,7,3,4,1]

        int[] arr2 = {7, 7, 2, 1, 7, 7, 7, 3, 4, 1};
        System.out.println(ins.minJumps(arr2));
    }
}