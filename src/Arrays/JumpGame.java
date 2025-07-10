package Arrays;

public class JumpGame {
    static  int jump(int[]arr){
        int maxJump=0;
        for(int i=0;i<arr.length;i++){
            if(i>maxJump) {return -1;}
            maxJump=Math.max(maxJump,i+arr[i]);
        }
        return  maxJump;
    }

    static  int cntJumpNeed(int[]arr){
        if(arr.length<=1) return 0;
        if(arr[0]==0) return -1;
        int maxJump=arr[0];
        int step=arr[0];
        int jump=1;
        for(int i=0;i<arr.length-1;i++){
            if (i == arr.length - 1) return jump;

            maxJump=Math.max(maxJump,arr[i]+i);
            step--;
            if(step==0){
                jump++;
                if(i>maxJump)return -1;
                step=maxJump-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n=arr.length;
        System.out.println(jump(arr));

    }
}
