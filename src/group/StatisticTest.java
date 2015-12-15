package group;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static group.Statistic.findFrequencyWords;
import static org.junit.Assert.assertEquals;

public class StatisticTest {

	@Test
	public void testFindFrequencyWordsIsResult() throws Exception {
		Map<String, Integer> map = new HashMap<>();
		map.put("aa", 1);
		map.put("bb", 2);
		assertEquals(findFrequencyWords("aa bb BB"), map);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindFrequencyWordsForNull() throws Exception {
		findFrequencyWords(null);
	}

	@Test
	public void testFindFrequencyWordsForEmptyString() throws Exception {
		Map<String, Integer> map = new HashMap<>();
		map.put("", 1);
		assertEquals(findFrequencyWords(""), map);
	}
}