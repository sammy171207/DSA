package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseRow {
    static ArrayList<ArrayList<Integer>> ninjaCity(ArrayList<ArrayList<Integer>> mat) {
      ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
      return  ans;

    }
    public static void main(String[] args) {
     int n=2;
     ArrayList<ArrayList<Integer>> input= new ArrayList<>();
     ArrayList<Integer> row1=new ArrayList<>();
     row1.add(1);
     row1.add(2);
     row1.add(3);
        ArrayList<Integer> row2=new ArrayList<>();
        row2.add(6);
        row2.add(4);
        row2.add(5);


     input.add(row1);
     input.add(row2);

//     for(int i=0;i< input.size();i++){
//         System.out.println(input.get(i));
//         ArrayList<Integer>change=new ArrayList<>();
//         for(int j=input.get(i).size()-1;j>=0;j--){
//             int n1=input.get(i).get(j);
//             change.add(n1);
//         }
//         input.set(i,change);
//
//     }   int i
        int idx=0;
        ArrayList<List<Integer>> ans=new ArrayList<>();
        for (ArrayList<Integer> e : input) {
            System.out.println(e.reversed());
            ans.add(e.reversed());
        }
        System.out.println(ans);
        System.out.println("-------------------");
        System.out.println(input);

    }
}
