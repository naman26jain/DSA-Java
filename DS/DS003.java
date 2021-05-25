//STRINGS
//check if given strings are anagram => frequency of all characters same 

import java.util.*;

class pre{
    public boolean preProcess(int num, int target) {
        while (num <= target) {
            for(int j=1;j<=target/2;j++){
                num += num + j - 1;
                if (num == target) {
                    return true;
                }
            }
        }

        

        return false;

    }
}

public class DS003 {

    

    public static void main(String[] args) {
        int noTestCases;
        Scanner sc = new Scanner(System.in);
        noTestCases = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < noTestCases; i++) {
            int temp = sc.nextInt();
            System.out.println("\n");
            al.add(temp);
        }

        pre obj = new pre();

        ArrayList<Integer> ct = new ArrayList<Integer>();
        int size = al.size();
        int count = 1;
        for (int i = 0; i < size; i++) {
            int softTarget = al.get(i);
            for (int j = 0; i < softTarget / 2; j++) {
                if (obj.preProcess(j, softTarget)) {
                    count++;
                }
            }
            ct.add(count);
        }
        for (int i = 0; i < size; i++) {
            System.out.println("case #" + (i + 1) + ": " + ct.get(i));
        }
        sc.close();

    }
}