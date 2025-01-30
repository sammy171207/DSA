package Sort.CoutSort;

public class Basic {

    static  int max(int[]arr){
        int maxNo=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maxNo<arr[i]){
                maxNo=arr[i];
            }
        }
        return maxNo;
    }
    static void basicCountSort(int []arr){
        int maxNo=max(arr);
        int[]count=new int[maxNo+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;  //count[12]++
        }
        int k=0;
        for(int i=0;i< count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }

    static void countSort(int []arr){
        int n=arr.length; //10
        int []output=new int[n];
        int maxNo=max(arr); //100
        int[]count=new int[maxNo+1]; //101 size
        for(int i=0;i<arr.length;i++){//freq arr
            count[arr[i]]++;
        }
        //prefix array of count array
        for(int i=1;i< count.length;i++){
            count[i]+=count[i-1];
        }
        //find the index of each el in the original array and put it in output arr
       for(int i=n-1;i>=0;i--){
           int idx=count[arr[i]]-1;
           output[idx]=arr[i];
           count[arr[i]]--;
       }

       //copy all the el of output to arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static void main(String[] args) {
    int []arr={12, 45, 78, 23, 56, 89, 34, 67, 100, 29};
//    int ma=max(arr);
//        System.out.println(ma);
        countSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
        }
    }

