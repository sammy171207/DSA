
import java.awt.dnd.DropTarget;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static void rotateByOne(int []arr){

     }

     static boolean palidrome(int num){
           int val=num;
           int reverse =0;
           while(num>0){
               reverse=reverse*10+(num%10);
               num/=10;
           }
           if(reverse==val) return true;
           return false;
     }

//     static void sort012(int[]arr){
//        int[]coutarr=new int[3];
//        for(int i=0;i<arr.length;i++){
//            coutarr[arr[i]]++;
//        }
//        int k=0;
//        for(int i=0;i<coutarr.length;i++){
//            for (int j = 0; j < coutarr[i]; j++) {
//                arr[k++] = i;
//            }
//        }
//     }
    public static void main(String args[] ) throws Exception {
           Scanner sc=new Scanner(System.in);
           ArrayList<Integer>arr=new ArrayList<>();
           int n=sc.nextInt();
           while(n!=42){
               arr.add(n);
               n=sc.nextInt();

           }
           for(int x:arr){
               System.out.println(x);
           }
    }
}

