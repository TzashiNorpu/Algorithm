package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class firstBadVersion_278 {
    int _version;

    private boolean isBadVersion(int version) {
        return version >= _version;
    }

    public int firstBadVersion(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
