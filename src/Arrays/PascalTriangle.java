package Arrays;

public class PascalTriangle {

    // this is help tp find the element present at col and row directly  in pascal triangle
    static int nCr(int c, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (c - i);
            res /= (i + 1);
        }
        return res;
    }
    // this function print the  number of row which tell
    static void printRow(int c ,int r){
        int ans=1;
        System.out.println(ans);
        for(int i=1;i<c;i++){
            ans*=(c-i);
            ans/=i;
            System.out.println(ans);
        }
        System.out.println(1);
    }
    public static void main(String[] args) {

    }
}
