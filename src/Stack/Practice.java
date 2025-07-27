package Stack;

import java.util.*;

public class Practice {
    static String inFixtoPostFix(String str) {
        Map<Character, Integer> precedence = new HashMap<>();
        precedence.put('^', 3);
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('+', 1);
        precedence.put('-', 1);

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            } else { // operator
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        precedence.get(stack.peek()) >= precedence.get(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }


   static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
   }

   static int subset(int[]arr,int sum){
        int cnt=0;
        int right=0;
        int check=0;
        for(int left=0;left<arr.length;left++){
            check+=arr[left];
            while(check>sum){
                check-=arr[right++];
            }
            if(check==sum){
                cnt++;
            }
        }
  return cnt;
   }
   
   static  int insertPosition(int[]arr,int target){
        int idx=0;
        if(arr.length<1){
            return 0;
        }
        int left=0,right=arr.length-1;
        while(left<right){
            int mid= (int) Math.floor(left+(right-left)/2);
            if(mid==target){
                return mid;
            } else if (arr[mid]>target) {
                idx=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return idx;
   }

   static int max(int []arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max=Math.max(max,num);
        }
        return max;
   }

   static int min(int[]arr){
        int min=Integer.MIN_VALUE;
        for(int num:arr){
            min=Math.min(min,num);
        }
        return min;
   }
   static ArrayList<Integer>repeartMiss(int[]arr){
        int n=max(arr);
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>re=new ArrayList<>();
       for (int num : arr) {
           map.put(num, map.getOrDefault(num, 0) + 1);
       }
       for(int i=1;i<=n;i++){
           if(re.size()==2) break;
           else if(!map.containsKey(i)){
               re.add(i);
           } else if (map.get(i)>1) {
               re.add(i);

           }
       }
    return  re;
   }
    public static void main(String[] args) {

        int []arr={1,3,5,6};
        int k=5;
        int inset=insertPosition(arr,k);
        System.out.println(inset);
    }
}
