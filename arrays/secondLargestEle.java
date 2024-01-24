public class secondLargestEle {
    static int LargetEle(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
        }
        return max;
    }

    static int secLargetEle(int[] arr){
        int max= LargetEle(arr);
        for(int i=0; i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secMax= LargetEle(arr);
        return secMax;
    }
    
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,7,8,9};
        int arr[]={-1,-2,-3,-4,-5,-6};
        System.out.println(secLargetEle(arr)) ;
    }
}