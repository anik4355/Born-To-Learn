public class Kadane_algo {
    public static void main(String[] args) {
        // int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr = {-3,-4,-2,-5};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int end = -1;
        int s= -1;
        
        for(int  i = 0; i<arr.length; i++){
            if(sum == 0) {
                s= i;
            }
            sum += arr[i];
            
            if(sum > max ){
                max = sum ;  
                start = s ;
                end = i; 
            }
            if(sum < 0){
                sum = 0;
            }
            
        }
        for(int j = start; j<=end; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.println(max);
        

    }

}
