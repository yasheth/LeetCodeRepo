package easy;

import java.util.HashMap;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
    	String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words) 
        	map.put(word, map.getOrDefault(word, 0) + 1);
        for(String word : banned) { 
        	if(map.containsKey(word)) 
        		map.remove(word);
        }
        String result = null;
        for(String word : map.keySet())
            if(result == null || map.get(word) > map.get(result))
                result = word;
        return result;
      }
	 
	public static void main(String[] args) {
		System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
	}
}