class digonalSum{



    public static int printdiogonalSum(int matrix[][]) {
        
        int sum =0;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         //for priamry digonal
        //         if(i==j){  //for not getting overlap
        //             sum +=matrix[i][j];  
        //         }
        //         //for secondary diagonal
        //         else if(i+j== matrix.length-1){
        //             sum +=matrix[i][j];
        //         }
        //     }
        // }

        //optimaze code

        for (int i = 0; i < matrix.length; i++) {
            //pd
            sum+=matrix[i][i];
            //sd
            // i+j = n-1
            //j = n-1-i;
            //so if we have i and n only so we can automatically find j also so i we have i and j so we will get matrix[i][j]
            if (i != matrix.length-1-i){   //i!=j contion 
                sum+=matrix[i][matrix.length-i-1];
            }
            
        }

        return sum;

    }

    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};

        System.out.println(printdiogonalSum(matrix));
        
    }

}