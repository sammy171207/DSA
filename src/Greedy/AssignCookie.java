package Greedy;

import java.util.Arrays;

public class AssignCookie {
    static  int findContentChildren(int[]g,int[]s){
        int cnt=0;
        Arrays.sort(g);
        Arrays.sort(s);

         int child=0;
         int cookie=0;
         while(child<g.length && cookie<s.length){
             if(s[cookie]>=g[child]){
                 child++;
             }
             cookie++;
         }
         return child;
    }
    public static void main(String[] args) {
        int []g={1,2};
        int [] s={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
