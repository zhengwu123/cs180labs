/**
 * Created by wu673 on 10/5/16.
 */
public class Matrix {
    public boolean isSymmetric(int[][] matrix){

        if(matrix[0].length!=matrix.length)
            return false;
        for(int i =0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]!=matrix[j][i])
                    return false;

            }
        }
       return true;
    }

    public boolean isDiagonal(int[][] matrix){
        int column = 0;
        if(matrix[0].length!=matrix.length)
            return false;
        for(int i =0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j==i)
                    continue;
                if(matrix[i][j]!=0)
                    return false;

            }

            }
        return true;
        }
    public boolean isIdentity(int[][] matrix){
        int column = 0;
        if(matrix[0].length!=matrix.length)
            return false;
        for(int i =0;i<matrix.length;i++) {
            if(matrix[i][i]!=1)
                return false;
            for (int j = 0; j < matrix.length; j++) {
                if (j == i)
                    continue;
                if(matrix[i][j]!=0) {
                    return false;
                }

            }

        }
        return true;
    }

    public boolean isUpperTriangular(int[][] matrix){

        if(matrix[0].length!=matrix.length)
        return false;
        for(int i =0;i<matrix.length;i++) {

            for (int j = 0; j < matrix.length; j++) {
                if(j>=i)
                    continue;
                if(matrix[i][j]!=0)
                    return false;

            }

        }
        return true;
    }

    public boolean isTridiagonal(int[][] matrix){
        if(matrix[0].length!=matrix.length)
            return false;
        for(int i =0;i<matrix.length;i++) {

            for (int j = 0; j < matrix.length; j++) {
              if(j==i)
                    continue;
                if(j-i==1 && j<matrix.length){
                   continue;
                }
                if(i-j==1 && i<matrix.length) {
                    continue;
                }
                if(matrix[i][j]!=0){
                    return false;
                }
            }


        }
        return true;

    }

    public static void main(String[] args) {
        Matrix ma = new Matrix();
        int [][]matrix = {{1, 0, 0},{0, 1, 0},{0, 0, 1}} ;
        int [][] matrix2 = {{1, 1, 0},{1, 1, 1},{0, 1, 1}} ;
        System.out.println("is symmetric: "+ma.isSymmetric(matrix));
        System.out.println("is diagonal: "+ma.isDiagonal(matrix));
        System.out.println("is identity: "+ma.isIdentity(matrix));
        System.out.println("is identity: "+ma.isUpperTriangular(matrix));

        System.out.println("is identity: "+ma.isTridiagonal(matrix));
        System.out.println("is identity: "+ma.isTridiagonal(matrix2));
    }
    }


