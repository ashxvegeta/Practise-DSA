import java.util.*;
    class spiralMatrix{
        public static void  printSpiralmatrix(int matrix[][]) {
            //samse pehle variable define karnage what will be the starting row , staring col,ending row and ending column
            int startRow =0;
            int startCol =0;
            int endRow = matrix.length-1;
            int endCol =matrix[0].length-1;
            //while loop ke andr spiral matrix print karenge
            while (startRow<=endRow && startCol<=endCol) {
            //sabse pehle top boundry ko print karange
            //j is getting used for column and i will be used jb bhi varable banyage apni row ko
            for (int j = startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //right boundry
            for (int i = startRow+1; i <=endRow; i++) {
                System.out.print(matrix[i][endCol]+" "); 
            }
            //bottom boundry
            for (int j = endCol-1; j>= startCol; j--) {
                //why in  bootom what we are trying to print its alerady got printed in top boundry that's why
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");   
            }
            //left boundry
            for (int i=endRow-1; i>= startRow+1; i--) {
                  //why in  left what we are trying to print its alerady got printed in right boundry that's why
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");   
            }
            //after printing one boundry we will update our variavle so that it can print another boundry
            startCol++;
            startRow++;
            endRow--;
            endCol--;

            }
            //after printing onr coundry break the line
            System.out.println();

        }

        public static void main(String args[]) {
           
            int matrix[][]= {{1,2,3,4},
                              {5,6,7,8},
                              {9,10,11,12},
                              {13,14,15,16}};
            
            printSpiralmatrix(matrix);

        }
}