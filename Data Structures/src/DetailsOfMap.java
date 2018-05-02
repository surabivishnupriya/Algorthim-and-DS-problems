import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DetailsOfMap {

	public static void main(String args[]) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "a");
		hmap.put(0, "a");
		hmap.put(134, "a");
		hmap.put(100, "b");
		hmap.put(4, "a");
		hmap.put(67, "a");
		hmap.put(179, "a");


		System.out.println("size of map:" + hmap.size());
		System.out.println("Hashmap elements:" + hmap.values()+hmap.entrySet());
		//Object removedEleted = hmap.remove("o");
		
		
		hmap.remove(67);
         System.out.println(hmap.size()+ hmap.get("b"));
		for (Map.Entry<Integer, String> me : hmap.entrySet()) {
			System.out.println("key:" + me.getKey() + " " + "value:" + me.getValue());
		}

		 Map<Integer,String> map =new TreeMap<Integer, String>(hmap);
		
		 System.out.println("After Sorting");
		
//		 for(Map.Entry<Integer, String> me1:map.entrySet())
//	 System.out.println("key:"+me1.getKey()+" "+"value:"+me1.getValue());
//		
		 System.out.println(hmap.entrySet());
		 System.out.println(map.values());
		Map<Integer, String> smap = sortByValue(hmap);
		System.out.println("After sorting");
		for (Map.Entry<Integer, String> me3 : smap.entrySet())
			System.out.println("key:" + me3.getKey() + " value:" + me3.getValue());


	}

	private static Map<Integer, String> sortByValue(HashMap<Integer, String> smap) {
		// TODO Auto-generated method stub

		
		List list = new LinkedList<Object>(smap.entrySet());
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}

		});

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;

	}

}
