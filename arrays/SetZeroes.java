public class SetZeroes {
    public void setZero(int [][] matrix){
        boolean firstrow=false;
        boolean firstCol=false;

        //set the markers in first row and first coloumn
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) firstrow=true;
                    if(j==0) firstCol=true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //replace the innner matrix
        for(int i=1 ;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        //last remaining checks 
        if(firstrow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
    
}
