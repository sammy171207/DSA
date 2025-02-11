import java.util.*;

public class tset {
    public static void main(String[] args) {
        int []nums={1,3,5,6};
        int target=5;
        int i=0;
        for(int x:nums){
            if(x==target){
                System.out.println(i);
            }
            i++;
        }
    }
}
