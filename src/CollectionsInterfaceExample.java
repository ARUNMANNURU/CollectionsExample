import java.util.*;
import java.util.function.BiFunction;

public abstract class CollectionsInterfaceExample{

	public static void main(String[] args) throws NoSuchElementException {
		// TODO Auto-generated method stub
		
		/* Map Interface Implementations */
		// Map map key and value pairs
		//No duplicate keys
		// satatic interface
		
		Map m = new TreeMap<>();
		m.put(0, 1);
		m.put(1, null);
		m.put(1, 1);
		m.put(0, 1);
		m.put(9, 9);
		StringBuilder s = new StringBuilder();
		System.out.println(m);
		System.out.println(m instanceof HashMap);
		System.out.println(m.containsKey(2));
		System.out.println(m.get(0));
		System.out.println(m.remove(0));
		System.out.println(m);
		System.out.println(m.values());
		m.clear();
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		
		HashMap hm = new HashMap();
		hm.put(1, 0);
		hm.put(0,1);
		hm.put(1, null);
		hm.put(1, 1);
		hm.put(0, 1);
		hm.put(2, 1);
		hm.put(null, 4);
		System.out.println(hm);
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		
		LinkedHashMap lhm = new LinkedHashMap<>();
		lhm.put(1, 3);
		lhm.put(0,1);
		lhm.put(1, null);
		lhm.put(1, 1);
		lhm.put(0, 1);
		lhm.put(2, 1);
		lhm.put(null, 4);
		lhm.put(8,null);
		System.out.println(lhm);
		
		Hashtable ht = new Hashtable<>();
		ht.put(0, 1);
		ht.put(0,1);
		ht.put(1, 4);
		ht.put(1, 1);
		ht.put(0, 1);
		ht.put(2, 1);
		ht.put(6, 4);
		ht.put(8,1);
		System.out.println(ht);
		System.out.println(ht.keySet());
		System.out.println(ht.entrySet());
		
		
		
		
		
		
//		HashSet hs = new HashSet();
//		hs.add(2);
//		hs.add(3);
//		hs.add(1);
//		hs.add("asdf");
//		hs.addAll(hs);
//		System.out.println(hs.size());
//		System.out.println(hs);
		
//		TreeSet ts = new TreeSet();
//		ts.add(2);
//		ts.add(6);
//		ts.add(1);
//		ts.add(0);
//		ts.addAll(ts);
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.first());
//		System.out.println(ts.ceiling(2));
//		System.out.println(ts.contains(3));
//		System.out.println(ts.size());
//		System.out.println(ts);
//		System.out.println(ts.hashCode());
//		System.out.println(ts.subSet(0, 2));
//		System.out.println(ts.headSet(3));
//		System.out.println(ts.tailSet(2));

		
//		Vector v = new Vector();
//		v.addElement(3);
//		v.addElement(2);
//		v.addElement("Ared");
//		v.addElement(1);
//		v.addElement(3);
//		v.addAll(v);
//		v.removeElementAt(2);
//		//v.removeAllElements();
//		System.out.println(v.elementAt(0));
//		System.out.println(v.size());
//		System.out.println(v);
//		System.out.println(v.capacity());
		
//		ArrayList alist = new ArrayList();
//		
//		alist.add(1);
//		alist.add(5);
//		alist.add("Heelo");
//		alist.add(2);
//		alist.add(3);
//		alist.addAll(alist);
//		System.out.println(alist.isEmpty());
//		System.out.println(alist.get(5));
//		System.out.println(alist.contains(3));
//		System.out.println(alist.size());
//		System.out.println(alist);
//		System.out.println(alist.subList(0, 3));
		
//		LinkedList list = new LinkedList();
//		list.add(9);
//		list.add(4);
//		list.add(1);
//		list.add(3);
//		list.add(2);
//		list.add(0);
//		list.add(9);
//		Iterator x = list.descendingIterator();
//		System.out.println(list);
//		while(x.hasNext()){
//		System.out.println(x.next());
//		}
//		System.out.println(list.element());
//		System.out.println(list.remove());
//		System.out.println(list.removeLast());
//		System.out.println(list.size());
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.isEmpty());
//		list.clear();
//		list.add(0, 2);
//		list.addAll(list);
//		list.addFirst(2);
//		list.addLast(0);
		
		/* Enumeration for legacy set of classes */
		
//		Vector v = new Vector();
//		v.addElement(10);
//		v.addElement(20);
//		v.addElement(30);
//		v.addElement(5);
//		v.addElement(1);
//		System.out.println(v.size());
//		System.out.println(v);
//		Enumeration en = v.elements();
//		while (en.hasMoreElements ())
//		{
//		Object val=en.nextElement ();
//		System.out.println (val);
//		}

//		Stack s = new Stack();
//		s.push(2);
//		s.push(243);
//		s.push(222);
//		s.push(20);
//		s.push(1);
////		System.out.println(s);
////		Enumeration en = s.elements();
////		while(en.hasMoreElements()){
////			Object val = en.nextElement();
////			System.out.println(val);
//		}	
	}

	private static BiFunction remappingFunction(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}		
		/*   List Interface   */
		
		/* Linked List Example Started  */
		/* Duplicates Allowed
		 * sorted order
		 * add data at position
		 * retrieve data in forward or reverse direction  
		 */
//		LinkedList list = new LinkedList();
//		list.add(9);
//		list.add(4);
//		list.add(1);
//		list.add(3);
//		list.add(2);
//		list.add(0);
//		Iterator x = list.descendingIterator();
//		System.out.println(list);
//		while(x.hasNext()){
//		System.out.println(x.next());
//		}
//		System.out.println(list.element());
//		System.out.println(list.remove());
//		System.out.println(list.removeLast());
//		System.out.println(list.size());
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.isEmpty());
//		list.clear();
//		list.addAll(list);
//		list.addFirst(2);
//		list.addLast(0);
		
		/*  End Of Linked List  */
		
		/* Array List 
		 * duplicates allowed
		 * Heterogeneous elements allowed
		 * add data at position
		 * retrieve data in forward or reverse direction
		 * cannot perform ascending or descending order
		 */
		
//		ArrayList alist = new ArrayList();
//		
//		alist.add(1);
//		alist.add(5);
//		alist.add("Heelo");
//		alist.add(2);
//		alist.add(3);
//		alist.addAll(alist);
//		System.out.println(alist.isEmpty());
//		System.out.println(alist.get(5));
//		System.out.println(alist.contains(3));
//		System.out.println(alist.size());
//		System.out.println(alist);
		
		/*  End of Array List */
		
		
		/* Vector 
		 * Heterogeneous elements allowed
		 * Insert element at any position
		 * cannot preform ascending or descending order
		 * 
		 */
		
		
//		Vector v = new Vector();
//		v.addElement(3);
//		v.addElement(2);
//		v.addElement("Ared");
//		v.addElement(1);
//		v.addAll(v);
//		v.removeElementAt(2);
//		//v.removeAllElements();
//		System.out.println(v.elementAt(0));
//		System.out.println(v.size());
//		System.out.println(v);
//		System.out.println(v.capacity());
		
		/*  End of Vector */
		
	
		/*   Stack 
		 * 	 Last in First out
		 * 	 able to retrieve data in one direction
		 * 	 searching is possible
		 * 
		 * 
		 */
		
//		Stack s = new Stack();
//		s.push(2);
//		s.push(4);
//		s.push(1);
//		s.push(6);
//		s.push(0);
//		s.pop();
//		System.out.println(s.search(6));
//		System.out.println(s.empty());
//		System.out.println(s.peek());
//		System.out.println(s);
		
		/*	End Of Stack  */

		
					/*     End of List Interface   */
		
		/*    Set			*/
		
		/*
		 * tree Set
		 * No duplicates
		 * No heteriogenous 
		 * sorted order
		 * Cannot allow to add 
		 */
		
//		
//		TreeSet ts = new TreeSet();
//		ts.add(2);
//		ts.add(6);
//		ts.add(1);
//		ts.add(3);
//		ts.addAll(ts);
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.first());
//		System.out.println(ts.ceiling(2));
//		System.out.println(ts.contains(3));
//		System.out.println(ts.size());
//		System.out.println(ts);
		
		/* Tree Set End  */
		
		/*  Linked Hash Set
		 *  No sorting
		 *  Hatero allowed
		 * 
		 * 
		 */
		
//		LinkedHashSet lhs = new LinkedHashSet();
//		lhs.add(2);
//		lhs.add(5);
//		lhs.add(1);
//		lhs.add("asdf");
//		lhs.addAll(lhs);
//		System.out.println(lhs.hashCode());
//		System.out.println(lhs.size());
//		System.out.println(lhs.contains(5));
//		System.out.println(lhs);
		
		/* End Linked Hash Set  */
		
		/*  Hash Set
		 *  Sorted order
		 *  won't add to tail
		 *  Hatero
		 * 
		 */
		
//		HashSet hs = new HashSet();
//		hs.add(2);
//		hs.add(3);
//		hs.add(1);
//		hs.add("asdf");
//		hs.addAll(hs);
//		System.out.println(hs);
		
		/*  End of Hashset   */
	