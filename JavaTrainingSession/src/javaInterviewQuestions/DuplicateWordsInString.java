package javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		findDuplicateWords("Hey java is java best language is java");
		/*	Output:
				java : 3
				is : 2 */
		findDuplicateWords("Hey python is not java but best language is python not java");
		/*	Output:
				python : 2
				not : 2
				java : 2
				is : 2 */
		findDuplicateWords("hi hi hi hi ");
		/*	Output:
				hi : 4 */
		findDuplicateWords("hi"); // No output due to no duplicate word hi
		findDuplicateWords("100 100 200 100 200");
		/*	Output:
				100 : 3
				200 : 2 */
	}
	
	public static void findDuplicateWords(String inputString) {
		
		//split the words:
		String[] words = inputString.split(" ");
		
		//create one HashMap:
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//To check each word in given array:
		// for(int i=0;i<=words.length;i++) ===> This traditional for can we can perform
		for(String word:words) {
			
			//if word is present:
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
		}
		
		//Extracting all the keys of map - wordCount
		Set<String> wordsInString = wordCount.keySet();
		
		//Perform for loop through all the words in wordCount
		for(String word:wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word +" : "+ wordCount.get(word));
			}
		}
	}
}