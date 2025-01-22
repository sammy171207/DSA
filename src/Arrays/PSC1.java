package Arrays;

public class PSC1 {
    public static void main(String[] args) {
        int [][]mat={{6, 5, 4},
                {1, 2, 5},
                {7, 9, 7}};
        int n=mat.length-1;
        int uppsum=0;
        int lowsum=0;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
//                System.out.println(mat[i][j]);
                uppsum+=mat[i][j];
            }
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
//                System.out.println(mat[i][j]);
                lowsum += mat[i][j];
            }
        }
        System.out.println(uppsum+" "+lowsum);
    }
}
