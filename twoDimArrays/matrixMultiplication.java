package twoDimArrays;

import java.util.*;

public class matrixMultiplication {
    static void takngInput(int arr[][], int m, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<m;i++){
            for(int j =0 ; j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    
    static void multiplication(int )


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first array");
        int m= sc.nextInt();
        int n = sc. nextInt();
        int[][] arr1 = new int [m][n];
        takngInput(arr1, m, n);
        System.out.println("second array");
        int r = sc.nextInt();
        int c= sc. nextInt();
        int [][] arr2= new int[r][c];
        takngInput(arr2, r, c);


    }
}
