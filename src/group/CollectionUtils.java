package group;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public final class CollectionUtils {

	private CollectionUtils() {
	}

	public static <T> Map<T, Integer> frequency(Collection<? extends T> collection) {
		Map<T, Integer> res = new TreeMap<>();
		for (T element : collection) {
			if (!res.containsKey(element)) {
				res.put(element, Collections.frequency(collection, element));
			}
		}
		return res;
	}
}