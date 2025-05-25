package Arrays;

public class MajorityEl {
    static int max(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static  int  malel(int[]arr){
         int max=max(arr);
         int[] countarr=new int[max+1];
         for(int i=0;i<arr.length;i++){
             countarr[arr[i]]++;
         }
         int k=0;
        int a=arr.length/2;
         for(int x:countarr){
             if(x>a){
                return k;
             }
             k++;
         }
         return -1;
    }

  /// Boyer Moore Alogrithms remember it
    static int optiomal(int[]arr){
        int el = 0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                el=arr[i];
                cnt=1;
            }
            if(el==arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

        int cnt1=0;
        for(int i=0;i<arr.length;i++){
            if(el==arr[i]){
                cnt1++;
            }
        }
        return cnt1>arr.length/2?el:0;
    }
    public static void main(String[] args) {
        int []arr={2,2,1,1,1,2,2};
        int []arr1={3,2,3};
        int []arr3={};
         int ans=optiomal(arr);
         int ans2=optiomal(arr1);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(optiomal(arr3));

    }
}
