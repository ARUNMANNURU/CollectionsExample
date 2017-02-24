import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
public class TreeMapExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Map<String , Integer> hashMap = new HashMap<>();
		hashMap.put("Arun", 1);
		hashMap.put("Amma", 2);
		hashMap.put("bandhi", 3);
		hashMap.put("anmesh", 4);
		hashMap.put("varun", 1);
		Map<String , Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println(treeMap);
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Anderson", 31);
		linkedHashMap.put("Lewis", 29);
		linkedHashMap.put("Cook", 29);
		// Display the age for Lewis
		System.out.println("\nThe age for " + "Lewis is " +linkedHashMap.get("Lewis"));
		System.out.println("Display entries in LinkedHashMap");
		System.out.println(linkedHashMap);

	}
}
