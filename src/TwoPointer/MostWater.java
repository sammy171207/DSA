package TwoPointer;

public class MostWater {

    ///  Find the Most Area that Water Hold
    static  int maxArea(int[]arr){
        int str=0,end=arr.length-1;
        int maxSize=Integer.MIN_VALUE;
        while(str<end){
            int maxWater=(end-str)*Math.min(arr[str],arr[end]);
            maxSize=Math.max(maxSize,maxWater);
            if(arr[str]<arr[end]){
                str++;
            }else{
                end--;
            }
        }
        return maxSize;
    }
    public static void main(String[] args) {
        int []arr={7,7,5,7,6,4};

        System.out.println(maxArea(arr));
    }
}
