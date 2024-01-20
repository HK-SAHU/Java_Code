package day5;

public class cross {
    public static void main(String[] args) {
        int n=11;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i+j==n-1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
