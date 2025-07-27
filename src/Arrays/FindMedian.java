package Arrays;

public class FindMedian {
    static  boolean findelement(int[][]matrix,int row,int col,int target){
        for(int i=0;i<row;i++){
            if(target>=matrix[i][0] && target<=matrix[i][col-1]){
                for(int j=0;j<col;j++){
                    if(matrix[i][j]==target){
                        return  true;
                    }
                }
            }
        }
     return  false;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;
        int row=matrix.length;
        int col=matrix[0].length;
        System.out.println(findelement(matrix,row,col,target));

    }
}
