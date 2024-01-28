public class sortZeroesAndOnes {
    static void zeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes= 0;   //count the number of zeroes
        for(int i=0 ; i<n; i++){
            if(arr[i]==0){
                zeroes++;
            } 
        }


        // 0 to zeroes -1 =0 and zeroes to n-1 =1;
        for(int i=0; i<n; i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args) {
        int[] arr= {1,1,1,0,0,0,1,1,0,1,0,1};
        zeroesAndOnes(arr);
        printArray(arr);
        
    }
}
