public class matrixadd{
    public static void main(String[] args) {
        int [][] m1= {{1,2,3},{4,5,6},{7,8,9}};
        int [][] m2= {{9,8,7},{6,5,4},{3,2,1}};
        int [][] result= new int[3][3];
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                result[i][j]=m1[i][j]+m2[i][j];
            }
        }
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(result[i][j]+" ");
            }
        System.out.println();
        }
    }
}