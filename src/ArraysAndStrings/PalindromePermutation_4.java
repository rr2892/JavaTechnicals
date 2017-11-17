package ArraysAndStrings;

import java.util.Hashtable;

public class PalindromePermutation_4 {

    public static void main(String[] args){
        String str1 = "Tact Coa";
        String str2 = "Ttact Coa";
        System.out.println(palindromePermutation(str1));
        System.out.println(palindromePermutation(str2));
    }

    static boolean palindromePermutation(String str){
        int[] letters = new int[128]; //ASCII assumed

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
            letters[(int)(str.charAt(i))]++;

        boolean oneOddAlready = false;

        for(int i = 0; i < letters.length; i++) {
            if (letters[i] % 2 != 0 && i != ' ') {
                System.out.println("ODD: " + i + " " + letters[i]);
                if (oneOddAlready)
                    return false;
                else
                    oneOddAlready = true;
            }
        }

        return true;

    }
}
