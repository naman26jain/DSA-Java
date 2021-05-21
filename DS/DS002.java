//QUESTIONS SOLVED REGARDING BITWISE OPERATORs
//How to understand the code? -> the questions will have multiple functions which will be solving diffrent questions  using bitwise operators

public class DS002 {
    public static void main(String[] args) {
        //here 1 is the value of k
       System.out.println(checkKset(5,2));
       System.out.println(isPowerOf(8));
       System.out.println(setBitCount(27));
       String[] str={"A","B","c"};
       generatePowerSet(str);
    }

    //checking if Kth bit from the right is set or not.
    static boolean checkKset(int num, int k){
       int c = 1<<(k-1);
        if((num & c) != 0)
            return true;
        else 
            return false;
    }

    //to check if number is power of 2
    static boolean isPowerOf(int num){
        if((num&(num-1)) !=0 || num==0)
        return false;
        else return true;
    }

    //counting number of set bits in the integer value using Brian Karnigham algo

    static int setBitCount(int num){
        int count =0;
        //if(isPowerOf(num))
        //count =1;
        while(num>0){
        num=(num&(num-1));
        count++;
        }

        return count;
    }

    //Given array that contains all elements even num of times except one element. Find odd occuring element
    //form a loop do xor withh all elements 
    //static int oddOccuring(int[] arr){

    //}

    //generating power set of a given set 
    //need to rectify the errors better
    static void generatePowerSet(String[] str){
        int n= str.length;
        int count= (n<<1);
        for(int i=0;i<count;i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0)
                System.out.println(str[j]);
            }
            System.out.println("\n");
        }
    }

}
