package TwoPointer;

public class Palidrome {
    static  boolean check(int nums){
        int original=nums;
        int reverse=0;
        while(nums>0){
            reverse=reverse*10+nums%10;
            System.out.println(reverse);
            nums/=10;
        }
        return reverse==original;
    }
    public static void main(String[] args) {
        boolean checkas=check(121);
        System.out.println(checkas);
    }
}
