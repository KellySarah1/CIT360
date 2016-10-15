import java.util.HashMap;
import java.util.Map;

public class JCHashmap {

	public static void main(String[] args) {
		/*
		 * HashMap is not sorted at all. Not maintain order
		 */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(3, "Three");
		map.put(2, "Two");
		
		// map.put(6, "Hello");
				
		String text = map.get(4);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
	}

}
