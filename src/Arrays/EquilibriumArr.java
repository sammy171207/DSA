package Arrays;

public class EquilibriumArr {
    static int equili(int []arr){
        int totalsum=0;
        int leftsum=0;
        for(int x:arr){
            totalsum+=x;
        }
        for(int i=0;i<arr.length;i++){
            totalsum-=arr[i];
            if(totalsum==leftsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
  int []arr={7, 1, 5, 2, -4, 3};
     int idx= equili(arr);
        System.out.println(idx);

    }
}
