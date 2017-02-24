import java.util.HashSet;



public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("JJJKKlll");
		hs.add("kkoohhik");
		hs.add("Aeun");
		hs.add("mkhfyu");
		System.out.println(hs.size());
		hs.remove("Aeun");
		System.out.println(hs.size());
		System.out.println(hs.hashCode());
		System.out.println(hs.retainAll(hs));
		//hs.clear();
		System.out.println(hs.equals(90));
		System.out.println(hs.contains(90));
		System.out.println(hs);
		for (String s : hs)
		{
			System.out.println(s.toUpperCase());
		}
		
	}

}
