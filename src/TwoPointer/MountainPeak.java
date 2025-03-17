package TwoPointer;

public class MountainPeak {
    static int mountainHill(int[] arr) {
        int leng = 0;
        if (arr.length < 3) return 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i, right = i;
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }
                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                leng = Math.max(leng, right - left + 1);
            }
        }

        return leng;
    }

    public static void main(String[] args) {
        int[] mountain = {2, 1, 4, 7, 3, 2, 5};
        int ans = mountainHill(mountain);
        System.out.println(ans);
    }
}
