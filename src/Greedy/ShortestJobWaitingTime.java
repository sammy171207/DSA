package Greedy;

import java.util.Arrays;

public class ShortestJobWaitingTime {
    static int totalwaitingTime(int[]arr){
        Arrays.sort(arr);
        int waitingtime=0;
        int process=0;
        for(int x :arr){
            waitingtime+=process;
//            System.out.print(process+" ");
            process+=x;
        }

        return waitingtime/arr.length;
    }
    public static void main(String[] args) {
        //1 + 2
        int[]arr={4, 1, 3, 7, 2};
        System.out.println(totalwaitingTime(arr));
    }
}
