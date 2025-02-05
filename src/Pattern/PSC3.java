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

    static  void tree(int n){
      for(int i=1;i<=n;i++){
          for(int j=0;j<n-i;j++){
              System.out.print(" ");
          }
          for(int j=1;j<=(2*i)-1;j++){
              System.out.print("*");
          }
          System.out.println();
      }
    }

    static  void diamond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

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

    static void arrow(int n){
         for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
         for(int i=1;i<n;i++){
             for(int j=n-i;j>=1;j--){
                 System.out.print("*");
             }
             System.out.println();
         }
    }

    static void binarytriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void NoTriangle(int n){
        int cnt=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//         pyramid(3);
//         reversePyramid(3);
//        tree(5);
//        diamond(3);
//        arrow(3);
//        binarytriangle(3);
        NoTriangle(5);

    }
}
