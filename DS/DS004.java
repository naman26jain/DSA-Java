
//lexographic rank problem
public class DS004 {
    int lexRank(String str) {
        int res =1;
        int len=str.length();
        int mal=fact(len);
        int[] counts = new int[256];
        counts[256]=0;
        for(int i=0;i<len;i++)
            counts[str[i]]++;

    }
}
