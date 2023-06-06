package StarPatternProblems;

public class StarPatterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(4);
    }
    static void pattern8(int n) {
        /*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
         */
        for (int row=1; row<=2*n; row++) {
            int colNumPerRow = row<=n ? row : 2*n-row;
            int noOfSpace = n-colNumPerRow;
            for(int j=0; j<noOfSpace; j++){
                System.out.print("  ");
            }
            for (int col=colNumPerRow; col>=1; col--){
                System.out.print(col+" ");
            }
            for (int col=2; col<=colNumPerRow; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern7(int n) {
        /*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
         */
        for (int row=1; row<=n; row++) {
            int noOfSpace = n-row;
            for(int j=0; j<noOfSpace; j++){
                System.out.print("  ");
            }
            for (int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for (int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n) {
        /*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
     1 2 3 4
      1 2 3
       1 2
        1
         */
        for (int row=1; row<=2*n-1; row++) {
            int colNumPerRow = row<=n ? row : 2*n-row;
            int noOfSpace = n-colNumPerRow;
            for(int j=0; j<noOfSpace; j++){
                System.out.print(" ");
            }
            for (int col=1; col<=colNumPerRow; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int n) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int row=1; row<=2*n-1; row++) {
            int colNum = row<=n ? row : 2*n-row;
            for (int col=1; col<=colNum; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern4(int n) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern3(int n) {
        /*

         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int row=0; row<n; row++) {
            for (int col=0; col<n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2(int n) {
        /*

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=5; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern1(int n) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
