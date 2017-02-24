import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String , Integer> lhm1 = new LinkedHashMap<>();
		lhm1.put("George", 1);
		lhm1.put("jim", 2);
		lhm1.put("John", 3);
		lhm1.put("Blake", 4);
		lhm1.put("Kevin", 5);
		lhm1.put("Michael", 6);
		
		Map<String , Integer> lhm2 = new LinkedHashMap<>();
		lhm2.put("George", 1);
		lhm2.put("katie", 2);
		lhm2.put("kevin", 3);
		lhm2.put("michelle", 4);
		lhm2.put("ryan", 5);
		lhm2.putAll(lhm1);
		System.out.println("Union of two lash maps are as follows:"+lhm2);
	}

}
