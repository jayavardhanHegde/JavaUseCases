package in.java.general.java.problems.map.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Util class to have all the Map related operations, 
 * mainly sorting the values based on values of the HashMap
 * @author jayavardhan
 * 
 */

public class MapUtil {

	
	
	/**
	 * Method to sort the Map based on the values
	 * @param inputMap
	 * @return Map
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValues(Map<K, V> inputMap) {
		ArrayList<Entry<K, V>> list = new ArrayList<Map.Entry<K, V>>(inputMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		});

		Map<K, V> resultMap = new LinkedHashMap<>();

		for (Map.Entry<K, V> entry : list) {
			resultMap.put(entry.getKey(), entry.getValue());
		}
		return resultMap;

	}
}
