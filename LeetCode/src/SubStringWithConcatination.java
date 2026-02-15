import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringWithConcatination {
    
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen) {
            return result;
        }
        Map<String, Integer> expected = new HashMap<>();
        for (String word : words) {
            expected.put(word, expected.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < wordLen; i++) {

            int left = i;
            int count = 0;
            Map<String, Integer> window = new HashMap<>();

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {

                String currentWord = s.substring(right, right + wordLen);

                if (expected.containsKey(currentWord)) {

                    window.put(currentWord,
                            window.getOrDefault(currentWord, 0) + 1);

                    count++;
                    while (window.get(currentWord) > expected.get(currentWord)) {

                        String leftWord = s.substring(left, left + wordLen);

                        window.put(leftWord,
                                window.get(leftWord) - 1);

                        left += wordLen;
                        count--;
                    }
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        SubStringWithConcatination object = new SubStringWithConcatination();
        String s = "barfoothefoobarman";
        String[] words = { "foo", "bar" };
        List<Integer> list = object.findSubstring(s, words);
        System.out.println(list);
    }
}
