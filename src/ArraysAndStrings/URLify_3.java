package ArraysAndStrings;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class URLify_3 {

    public static void main(String[] args){
        String str1 = "Mr    John     Smith                  ";
        System.out.println(urlify(str1.toCharArray()));
    }

    static char[] urlify(char[] str){
        LinkedList<Character> nextChars = new LinkedList<Character>();
        int index = 0;

        while(index < str.length){
            nextChars.addLast(str[index]);
            str[index] = nextChars.removeFirst();
            if(str[index] == ' '){
                str[index] = '%';
                nextChars.addFirst('0');
                nextChars.addFirst('2');
            }
            index++;
        }

        return str;
    }


}
