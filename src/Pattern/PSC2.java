package Pattern;

public class PSC2 {
    static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void printNo(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static  void printonI(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static  void reverseT(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void reverseN(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        printNo(3);
//        print(3);
//        printonI(3);
//        reverseT(3);
        reverseN(3);
    }
}
