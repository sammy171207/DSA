package TwoPointer;

public class CountNiceArr {
    public static int niceArraySize(int[] niceArr, int k) {
        return atMost(niceArr, k) - atMost(niceArr, k - 1);
    }

    private static int atMost(int[] niceArr, int k) {
        if (k < 0) return 0;

        int left = 0, count = 0, oddCount = 0;
        for (int right = 0; right < niceArr.length; right++) {
            oddCount += niceArr[right] % 2;
            while (oddCount > k) {
                oddCount -= niceArr[left] % 2;
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int []niceArr={1,1,2,1,1};
        int k=3;
        int count=niceArraySize(niceArr,k);
        System.out.println(count);
    }
}
