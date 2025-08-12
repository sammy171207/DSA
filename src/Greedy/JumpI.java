package Greedy;

import javax.sound.midi.SysexMessage;

public class JumpI {
    static boolean checkIsReacPossible(int[]arr){
       int maxReach=0;
       for(int x:arr){
           if(maxReach>=arr.length) return  true;
           maxReach=Math.max(maxReach,maxReach+x);
       }
       return false;
    }
    public static void main(String[] args) {
        int[]jump={2,0};
        int[]jummps={3,2,1,0,4};
        System.out.println(checkIsReacPossible(jump));
        System.out.println(checkIsReacPossible(jummps));
    }
}
