package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simplifyPath_071Test {

    @Test
    void simplifyPath() {
        simplifyPath_071 ins = new simplifyPath_071();
        System.out.println(ins.simplifyPath("/home/"));
        System.out.println(ins.simplifyPath("/../"));
        System.out.println(ins.simplifyPath("/home//foo/"));
        System.out.println(ins.simplifyPath("/home/../../../../foo/"));
        System.out.println(ins.simplifyPath("/a/./b/../../c/"));
        System.out.println(ins.simplifyPath("/a//b////c/d//././/.."));
    }
}