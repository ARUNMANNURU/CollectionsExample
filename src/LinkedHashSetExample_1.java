import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.io.*;
public class LinkedHashSetExample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LinkedHashSet lhs1	= new LinkedHashSet();
//		lhs1.add("George");
//		lhs1.add("jim");
//		lhs1.add("John");
//		lhs1.add("Blake");
//		lhs1.add("Kevin");
//		lhs1.add("Michael");
//		LinkedHashSet lhs2	= new LinkedHashSet();
//		lhs2.add("George");
//		lhs2.add("katie");
//		lhs2.add("Kevin");
//		lhs2.add("michelle");
//		lhs2.add("ryan");
//		lhs2.retainAll(lhs1);
//		System.out.println("Intersection:"+lhs2);
//		System.out.println("Union:"+lhs2.addAll(lhs1));
		
		try{
			FileInputStream fis = new FileInputStream("/Users/ArunMannuru/Desktop/arun.pages");
			System.out.println(fis.read());
			fis.close();
			//ObjectOutputStream objs =  new ObjectOutputStream(new FileOutputStream("/Users/ArunMannuru/Desktop/arun.pages"));
			//objs.writeObject(lhs1);
			//objs.close();
		}catch(Exception ex){
			ex.printStackTrace();
			}
		}
		}
