package group;

import java.util.*;

public class Statistic {

	public static Map<String, Integer> findFrequencyWords(String target) {
		if (target == null) {
			throw new IllegalArgumentException("Argument is null");
		}
		List<String> worlds = new ArrayList<>();
		Collections.addAll(worlds, target.toLowerCase().split(" "));
		Map<String, Integer> frequencyWords = new TreeMap<>();
		for (String word : worlds) {
			if (!frequencyWords.containsKey(word)) {
				frequencyWords.put(word, Collections.frequency(worlds, word));
			}
		}
		return frequencyWords;
	}
}
