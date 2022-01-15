package algo.tzashinorpu.Daily.CN;

public class LeetCode_390 {
    public int lastRemaining(int n) {
        // 1,2,3,4,5
        // f(i)是序列[1,i]从左往右隔个换向消除一次后最终左侧的数字 -> f(5)=2
        // f'(i)是从右往左隔个换向消除一次后最终右侧的数字 -> f'(5)=4
        // f'(i) 可以认为是将序列逆序，从左到右，间隔换向删除删除
        // 则 f(5) = [ 1,2,3,4,5 -> 从左到右 隔个换向删除]
        // 则 f'(5) = [ 5,4,3,2,1 -> 从左到右 隔个换向删除]
        // f(i)+f'(i) = i+1
        // f(5)=1,2,3,4,5 -> 2,4 -> 2
        // f'(5/2)=2,1 -> 2  -> f(i)=2*f'(i/2)
        // f(i)=1,2,3...i =x 从左到右间隔删除一次  -> 2,4,6...[i]|[i-1]  -> 每个数除以 2 映射为有序序列 1,2,3...[i/2] -> 此时进行从左到右的间隔换向删除则为 f'(i/2) = x/2
        // 结合 f(i)=2*f'(i/2) 和 f(i)+f'(i) = i+1 -> f(i) = 2*(i/2+1-f(i/2)) -> 得到递归
        return n == 1 ? 1 : 2 * (n / 2 + 1 - lastRemaining(n / 2));
    }
}