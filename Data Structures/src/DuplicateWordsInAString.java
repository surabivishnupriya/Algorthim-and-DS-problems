import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWordsInAString {
	public static void main(String[] args) {

		String sen = "Bharath Love Vishnu Priya so much so much";
		String[] words = sen.split("\\s+");
		Map<String, Integer> wordToLength = new HashMap<String, Integer>();
		int count=0;
		for(String word:words) {
			if(wordToLength.containsKey(word)) {
				
			
			count=wordToLength.get(word);
			wordToLength.put(word, ++count);
		}
			else {
				wordToLength.put(word, 1);
			}
		}
		System.out.println(wordToLength);
		
		/*for (int j = words.length - 1; j >= 0; j--) {
			//String word = words[j];
			char[] chars = words[j].toCharArray();
			for (int i = chars.length - 1; i >= 0; i--) {
				System.out.print(chars[i]);
			}
			System.out.print(" ");
		}*/
	}
}
