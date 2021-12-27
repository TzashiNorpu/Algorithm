package algo.tzashinorpu.Daily;

import algo.tzashinorpu.Daily.CN.LeetCode_825;
import org.junit.jupiter.api.Test;

class LeetCode_825Test {

    @Test
    void numFriendRequests() {
        LeetCode_825 ins = new LeetCode_825();
        int[] ages1 = {73, 106, 39, 6, 26, 15, 30, 100, 71, 35, 46, 112, 6, 60, 110};
//        int[] ages1 = {6, 6, 15};
        System.out.println(ins.numFriendRequests1(ages1));
        System.out.println(ins.numFriendRequests2(ages1));
        System.out.println(ins.numFriendRequests2_1(ages1));
        System.out.println(ins.numFriendRequests3(ages1));
        int[] ages2 = {16, 17, 18};
        System.out.println(ins.numFriendRequests1(ages2));
        System.out.println(ins.numFriendRequests2(ages2));
        System.out.println(ins.numFriendRequests2_1(ages2));
        System.out.println(ins.numFriendRequests3(ages2));
    }
}