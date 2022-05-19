package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class guessNumber_374 {
    int PickN;

    public int guessNumber_1(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (guess(mid) == 1) l = mid + 1; // l左侧<n
            else if (guess(mid) == -1) r = mid - 1;// r 右侧>n
            else return mid;
        }
        return -1;
    }

    public int guessNumber_2(int n) {
        int l = 0, r = n == Integer.MAX_VALUE ? n : n + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (guess(mid) == 1) l = mid + 1; // l左侧<n
            else if (guess(mid) == -1) r = mid;// r 及其右侧>n
            else return mid;
        }
        return n;
    }

    private int guess(int num) {
        return Integer.compare(PickN, num);
    }
}
