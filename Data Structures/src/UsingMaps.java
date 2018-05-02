import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class UsingMaps {
	
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		
		
		hm.put("a", "c");
		hm.put("b", "c");
		hm.put("c", "d");
		hm.put("d", "e");
		hm.put("e", "f");
		hm.put("f", "f");
		
		Hashtable<String,String> ht=new Hashtable<String,String>(hm);
		
		for(Map.Entry m:ht.entrySet())
			
			System.out.println("Key:"+m.getKey()+" value:"+m.getValue());
		
		
		
	}

}
