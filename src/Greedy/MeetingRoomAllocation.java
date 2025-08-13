package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingRoomAllocation {
    static void maximumNumberofMeetingPossible(int[]str,int[] end){
        int [][]twoD=new int[str.length][3];
        for(int i=0;i<str.length;i++){
            twoD[i][0]=str[i];
            twoD[i][1]=end[i];
            twoD[i][2]=i;
        }
        Arrays.sort(twoD,(a,b)->a[1]-b[1]);
//        for(int[]row:twoD){
//            System.out.println(Arrays.toString(row));
//        }
        int meetNo=1;
        int freetime=twoD[0][1];
        List<Integer> order=new ArrayList<>();
        order.add(twoD[0][2]);
        for(int i=1;i<twoD.length;i++){
            if(twoD[i][0]>freetime){
                freetime=twoD[i][1];
                order.add(twoD[i][2]);
//                System.out.println(twoD[i][0]);
                meetNo++;
            }
        }
        System.out.println(meetNo);
    }
    public static void main(String[] args) {
        int[] str={1, 3, 0, 5, 8, 5};
        int[]end={2, 4, 6, 7, 9, 9};
    maximumNumberofMeetingPossible(str,end);
    }
}
