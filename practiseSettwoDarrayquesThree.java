public class practiseSettwoDarrayquesThree {
    
    public static void  transPosematrix(int matrix[][]){
       
        
        int[][] newarr = new int[3][2];

        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                
                newarr[j][i]= matrix[i][j];

            }

           
        }


        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[0].length; j++) {
                System.out.print(newarr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int matrix[][]= {{1,2,3},
                         {4,5,6},
                         };
        transPosematrix(matrix);                 
    }
}
