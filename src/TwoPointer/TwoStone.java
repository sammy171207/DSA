package TwoPointer;

public class TwoStone {
    static int equalStone(int[]arr,int n){
        int maxStone=0;
        int ramSum=arr[0],shyamSum=arr[arr.length-1];
        int left=1,right=n-2;
        while(left<right){
            if(ramSum>shyamSum){
                shyamSum+=arr[right];
                right--;
            } else if (shyamSum>ramSum) {
                ramSum+=arr[left];
                left++;
            }else{
                maxStone=Math.max(maxStone,ramSum);
                if(left<right){
                    ramSum+=arr[left++];
                    shyamSum+=arr[right--];
                }
            }
        }
        return  maxStone;
    }
    public static void main(String[] args) {
        int []arr={100,8,97,2,1};
        int n=arr.length;
        System.out.println(n);
    }
}
