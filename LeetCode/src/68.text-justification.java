/*
 * @lc app=leetcode id=68 lang=java
 *
 * [68] Text Justification
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        StringBuilder sb = new StringBuilder(); 
        List<String> list = new ArrayList<>();
        int i = 0;
        int sum = 0;
        int count = 0;
        while(i< words.length){
           if(count == 0){
            sum += words[i].length();
            sb.append(words[i]);
            count++;
           }else if(count > 0){
            sum += words[i].length()+1;
            if(sum<= maxWidth){
                sb.append(' ').append(words[i]);
                count++;
            }else{
                list.add(sb.toString());
                sum = words[i].length();
                count = 1;
                sb = new StringBuilder();
                sb.append(words[i]);
            }
           }
            i++;  
        }
        list.add(sb.toString());
        List<String> result = new ArrayList<>();
        int j = 0;

        while(j < list.size()){
            String line = list.get(j);
            String[] arr = line.split(" ");

            // count total characters (without spaces)
            int chars = 0;
            for(String w : arr) chars += w.length();

            int gaps = arr.length - 1;
            StringBuilder newLine = new StringBuilder();

            // Last line OR single word → left justify
            if(j == list.size() - 1 || gaps == 0){
                for(int k = 0; k < arr.length; k++){
                    newLine.append(arr[k]);
                    if(k < arr.length - 1) newLine.append(" ");
                }
                while(newLine.length() < maxWidth){
                    newLine.append(" ");
                }
            } 
            else {
                int totalSpaces = maxWidth - chars;
                int spaceEach = totalSpaces / gaps;
                int extra = totalSpaces % gaps;

                for(int k = 0; k < arr.length; k++){
                    newLine.append(arr[k]);

                    if(k < arr.length - 1){
                        int spaces = spaceEach + (extra > 0 ? 1 : 0);
                        extra--;

                        for(int s = 0; s < spaces; s++){
                            newLine.append(" ");
                        }
                    }
                }
            }

            result.add(newLine.toString());
            j++;
        }
        return result;
    }
}
// @lc code=end

