package Arrays;

public class Findfirstrepeat {
    static boolean checkrepeated(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        boolean ok=checkrepeated(arr);
        System.out.println(ok);
    }
}
