package Greedy;

import java.util.Arrays;

public class MinimumPlatformNeed {
    static int minimumPlatformForRailway(int[] arrived, int[] departure) {
        Arrays.sort(arrived);
        Arrays.sort(departure);

        int i = 0, j = 0;
        int cnt = 0, maxCnt = 0;

        while (i < arrived.length && j < departure.length) {
            if (arrived[i] < departure[j]) {
                cnt++;
                maxCnt = Math.max(cnt, maxCnt);
                i++;
            } else {
                cnt--;
                j++;
            }
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        int[] Arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] Departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minimumPlatformForRailway(Arrival, Departure));
    }
}
