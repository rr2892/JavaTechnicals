package ArraysAndStrings;

import java.util.Hashtable;

public class IsUnique_1 {

    public static void main(String[] args){
        String test1 = "hello Brian";
        String test2 = "asdfjkl;";
        String test3 = "aA";
        String test4 = "Never stop never settle";

        System.out.println(isUnique(test1));
        System.out.println(isUnique(test2));
        System.out.println(isUnique(test3));
        System.out.println(isUnique(test4));

        /**
         * Expected Output:
         *
         * false
         * true
         * true
         * false
         */
    }

    /**
     * Time: O(N)   where N = str.length()
     * Space: O(N)  where N = str.length()
     * @param str
     * @return
     */
    static boolean isUnique(String str){
        Hashtable<Character, Integer> charTable = new Hashtable<Character, Integer>();
        for(int i = 0; i < str.length(); i++)
            if(charTable.putIfAbsent(str.charAt(i), 1) != null)
                return false;
        return true;
    }

}
