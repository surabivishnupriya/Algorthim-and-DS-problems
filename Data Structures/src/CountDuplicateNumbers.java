import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateNumbers {

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 6, 5, 2, 1, 6, 7, 3, 6, 6, 0 };
		Map<Integer, Integer> countDuplicates = new HashMap<Integer, Integer>();
		for (int i : array) {
			if (countDuplicates.containsKey(i)) {
				int count = countDuplicates.get(i);
				countDuplicates.put(i, ++count);
			} else {
				countDuplicates.put(i, 1);
			}
		}

		for (Entry<Integer, Integer> i : countDuplicates.entrySet()) {
			if (i.getValue() > 1)
				System.out.println(i);
		}

	}

}
