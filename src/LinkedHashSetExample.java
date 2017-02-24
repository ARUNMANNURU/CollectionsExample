import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Arun");
		lhs.add("Arun");
		lhs.add("Varun");
		lhs.add("Baroon");
		lhs.addAll(lhs);
		lhs.remove(210);
		//lhs.clear();
		System.out.println(lhs.retainAll(lhs));
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		System.out.println(lhs);
		for ( String s : lhs)
		{
			System.out.println(s.toLowerCase());
		}
	}

}
