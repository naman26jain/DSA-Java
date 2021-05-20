

//pefix sum  for a fixed array sum of multiple quesries.

public class DS001{

    // solution of the problem in O(n) time complexity.
    static int getSum(int start, int end, int[] arr)
    {
        int sum =0;
        for(int i=start;i<=end;i++){
            sum += arr[i];
        }    
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {2,8,3,9,6,5,4};
        int Sum = getSum(2,5,arr);
        System.out.println(Sum);
        System.out.println(sum(2,5,arr));
    }

    //to run this same question in O(1) time we need to do pre processing of array i.e. by calculating prefix sum.
    static int sum(int start, int end, int[] arr){
        
        if(start==0){
            return PrefixSum(end, arr);

        }
        else{
       return PrefixSum(end, arr)-PrefixSum(start-1, arr);
    }}
    //this is the code for preprocessing the array
    static int PrefixSum(int n, int[] arr){
        int prefixSum =0;
        for (int i=0;i<=n;i++){
            prefixSum +=arr[i];
        }
        return prefixSum;
    }
}