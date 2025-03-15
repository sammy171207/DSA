package String;

public class Cleardigits {
    static String clear(String str){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o' || str.charAt(i)=='u'){
                ans.append(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o' || str.charAt(i)=='u'){
                continue;
            }
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str="masai";
        String ans=clear(str);
        System.out.println(ans);

    }
}
