package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class WordLadder {
	static HashSet<String> wordList;
	static String end;
	public static int ladderLength(String beginWord, String endWord, List<String> wordAsList) {
		wordList = new HashSet<String>(wordAsList);
		if(!wordList.contains(endWord)) return 0;
		HashSet<String> start = new HashSet<String>();
		start.add(beginWord);
		end = endWord;
		int length = 1;
		while(!wordList.isEmpty()) {
			HashSet<String> next = new HashSet<String>();
			for(String words: start) {
				System.out.println("Checking Transformations for "+words);
				List<String> temp = getTransformations(words);
				if(temp.size()==0)
					wordList.remove(words);
				next.addAll(temp);
				
				if(next.contains(endWord))
					return length+1;
			}
			if(next.isEmpty()) 
				break;
			start = next;
			for(String s1: start)
	        	System.out.println("Received and added to start are "+s1);
			for(String s1: wordList)
	        	System.out.println("wordList has "+s1);
			length++;
		}
		return 0;
	}
	
	public static List<String> getTransformations(String s){
		ArrayList<String> transformed_words = new ArrayList<String>();
		char[] wordArray = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            char old = wordArray[i];
            for(char c='a'; c<='z'; c++){
                wordArray[i] = c;
                String str = String.valueOf(wordArray);
                if(end.equals(str)) {
                	transformed_words.add(str);
                    return transformed_words;
                }
                if(wordList.contains(str)){
                    transformed_words.add(str);
                    wordList.remove(str);
                }
            }
            wordArray[i] = old;
        }
        for(String s1: transformed_words)
        	System.out.println("Transformations are "+s1);
		return transformed_words;
	}

	public static void main(String[] args) {
		String[] list= new String[]{"hot","dot","dog","lot","log","cog"};
		System.out.println(ladderLength("hit", "cog", Arrays.asList(list)));
	}

}
