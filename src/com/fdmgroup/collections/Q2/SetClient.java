package com.fdmgroup.collections.Q2;
import java.util.HashSet;
import java.util.Set;
	
public class SetClient {
		public static void main (String[] args) {
			String george = new String("George");
			String george1 = new String("George");
			String kukie = new String("Kukie");
			String mark = new String("Mark");
			String mark1 = new String("Mark");
			String prodi = new String("Prodi");
			String boris = new String("Boris");
			Set<String> set = new HashSet<String>();
		      set.add(george);
		      set.add(george1);
		      set.add(kukie);
		      set.add(mark);
		      set.add(mark1);
		      set.add(prodi);
		      set.add(boris);
		      
		     
		      System.out.println(set);
		      
		}

}
