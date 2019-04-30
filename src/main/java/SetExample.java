import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("Raghvendra");
		s.add("Rahul");
		s.add("Amit");
		s.add("Vinod");
		s.add("Raghvendra");
		s.add("Nilesh");
		
		System.out.println(s.size());
		
//		for (String s1 : s) {
//			
//			System.out.println(s1);
//			
//		}
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}

	}

}
//This new comment is added for Git HUb Push Test
