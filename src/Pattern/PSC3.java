package Pattern;

public class PSC3 {
    static  void  pyramid(int n){
        for(int i=1;i<=n;i++){
           for(int j=i;j<n;j++){
               System.out.print(" ");
           }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void reversePyramid(int n){
        for (int i = n; i >= 1; i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void comPyramid(int n){
    
    }
    public static void main(String[] args) {
//         pyramid(3);
//         reversePyramid(3);
       comPyramid(3);
    }
}
