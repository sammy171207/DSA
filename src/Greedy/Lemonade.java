package Greedy;

public class Lemonade {
    static  boolean checkChange(int[]arr){
        int five=0;
        int ten=0;
        for(int x:arr){
            if(x==5){
              five++;
            }
            else if(x==10){
                 if(five==0) return  false;
                five--;
                ten++;
            } else if (x==20) {
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }

       return true;
    }
    public static void main(String[] args) {
        int[]bills={5, 5, 10, 5, 20};
        boolean ans=checkChange(bills);
        System.out.println(ans);
    }
}
