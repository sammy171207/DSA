package TwoPointer;

public class RainTrap {
    static int trapwater(int[]arr){
        int waterstore=0;
        int left=0;
        int right=arr.length-1;
        int left_max=arr[0];
        int right_max=arr[right];
        while (left<right){
            if(left_max<right_max){
                left++;
                left_max=Math.max(arr[left],left_max);
                waterstore+=Math.max(0, Math.min(left_max, right_max) - arr[left]);
            }
            else{
                right--;
                right_max=Math.max(arr[right],right_max);
                waterstore+=Math.max(0, Math.min(left_max, right_max) - arr[right]);
            }
        }
        return waterstore;
    }
    public static void main(String[] args) {
        int[] height={4,2,0,3,2,5};
        int[]arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapwater(height));
        System.out.println(trapwater(arr));
    }
}
