import java.util.Scanner;
class First{
   public static int findMax(int matrix[][]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
    
        return max;
    }

 public static void main(String[] args){


    int  Metrix[][] = new int[3][3];
    int m= Metrix.length,n=Metrix[0].length;
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
          Metrix[i][j] = sc.nextInt();                 
        }
    }
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(Metrix[i][j] + " ");
       }
        System.out.println();
    }
   System.out.println( findMax(Metrix));
  }

}
