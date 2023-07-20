package hashing.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPointsCovered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //making the 2d array to store all the points
        System.out.println("Enter the number of points:");
        int n=sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        //taking input for sub matrix dimensions
        System.out.println("Enter the dimensions of the submatrix:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = maxPointCovered(arr,n,x,y);
        System.out.println(ans);
//        maxPointCovered(arr,n,x,y);
//        System.out.println(ans);
    }

    //This method will return the max number of points in the sub matrix of given dimension
    static int maxPointCovered(int[][] arr, int n, int x, int y) {
        int row = 0, col = 0, ans = 0;

        //finalizing the size of row and col for the prefix sum matrix
        for(int i=0; i<n; i++){
            if(arr[i][1]>row) row = arr[i][1];
            if(arr[i][0]>col) col = arr[i][0];
        }

        //As we know that the actual location of points will be reverse as the row & col will be interchanged inside
        // the matrix, hence will make a hash 2d array or hash matrix and locating those points in this hash matrix
        int[][] mat = new int[row+1][col+1];
        for(int i=0; i<n; i++){
            mat[arr[i][1]][arr[i][0]] += 1;
        }

        //This step, will calculate the prefix sum at each matrix points and prepare the prefix sum matrix
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                mat[i][j] += mat[i-1][j] + mat[i][j-1] - mat[i-1][j-1];
            }
        }
        for(int[] a:mat){
            System.out.println(Arrays.toString(a));
        }

        //finally calculating the max number of points from prefix sum matrix in a typical way
        for(int i=y; i<=row; i++){
            for(int j=x; j<=col; j++){
            int subMatSum;
            subMatSum = mat[i][j] - mat[i-y][j] - mat[i][j-x] + mat[i-y][j-x];
            ans = Math.max(ans,subMatSum);
            }
        }
        return ans;
    }
}
