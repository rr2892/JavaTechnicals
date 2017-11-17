package ArraysAndStrings;

import java.util.Hashtable;

public class CheckPermutation_2 {

    public static void main(String[] args){
        String[] test = {"hello", "lelho", "This perm", "sihT merp", "This perm", "siht merp", "not really", "not reallly"};

        for(int i = 0; i < test.length-1; i+=2)
            System.out.println(checkPermutation(test[i], test[i+1]));
    }


    static boolean checkPermutation(String str1, String str2){
        Hashtable<Character, Integer> charTable = new Hashtable<Character, Integer>();

        for(int i = 0; i < str1.length(); i++) {
            if(!charTable.containsKey(str1.charAt(i)))
                charTable.put(str1.charAt(i), 1);
            else
                charTable.replace(str1.charAt(i), charTable.get(str1.charAt(i)) + 1);
            System.out.println(str1.charAt(i) + ": " + charTable.get(str1.charAt(i)));
        }

        for(int i = 0; i < str2.length(); i++){
            if(!charTable.containsKey(str2.charAt(i)))
                return false;
            else{
                int value = charTable.get(str2.charAt(i));
                if(value - 1 < 0)
                    return false;
                else
                    charTable.replace(str2.charAt(i), charTable.get(str2.charAt(i)) - 1);
            }
            System.out.println(str2.charAt(i) + ": " + charTable.get(str2.charAt(i)));
        }

        return true;

    }


}
