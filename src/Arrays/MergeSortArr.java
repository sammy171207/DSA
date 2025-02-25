package Arrays;

public class MergeSortArr {
    static  int[]mergeSort(int[]n1,int[]n2,int m, int n){
        int i=0,j=0;
        int []temp=new int[m+n];
        int k=0;
        while(i<m && j<n){
             if(n1[i]<n2[j]){
                 temp[k++]=n1[i++];
             }else{
                 temp[k++]=n2[j++];
             }
        }
        while (i<m){
            temp[k++]=n1[i++];
        }
        while (j<n){
            temp[k++]=n2[j++];
        }
        return  temp;
    }
    public static void main(String[] args) {
     int[]n1={1,2,3,0,0,0};
     int[]n2={2,5,6};
        int []result=mergeSort(n1,n2,3,3);
        for(int x:result){
            System.out.print(x+" ");

        }
    }
}
