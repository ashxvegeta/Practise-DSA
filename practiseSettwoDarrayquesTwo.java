public class practiseSettwoDarrayquesTwo {
    public static void  sumOfrowOne(int matrix[][]){
        int count =0;
        // for (int i = 0; i < matrix.length; i++) {
        //      for (int j = 0; j < matrix[i].length; j++) {
        //           if(i==1){
        //             count += matrix[i][j];
        //           }
        //      }
        // }

        //only itearet 2nd row  elements
        for (int j = 0; j < matrix[0].length; j++) {
            count += matrix[1][j];
          
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        int matrix[][]= {{1,4,9},
                         {11,4,3},
                         {2,2,3},
                         };
        sumOfrowOne(matrix);                 
    }
}
