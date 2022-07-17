package arrayCollections;

import java.util.HashSet;
import java.util.Set;

public class SetColletion {

	public static void main(String[] args) {
		//2-Set: Generally means No duplicate allowed.
		// we have HashSet, LinkHashSet and TreeSet
		//HashSet(allow no duplicate), LinkHashSet(No duplicate, Insertion Order), TreeSet(No duplicate, Alphabic Order)
		
		//Formula is same like List arrays.
		//Set<Object DataType>+ objName = new + TypeOfList + <Object DataType>();
		
		//Interview Question: Can you tell me about Set (in java collection)?
		//When we are working with Set java collections, we can be working with HashSet, LinkHashSet and TreeSet,
		//generally Set means no duplicate allowed. if are not care about order we pick HashSet, if we care how we added them
		//we use LingHashSet and if we want them to be in alphabical order we use TreeSet.
		//which one is faster. 1.HashSet> 2.LinkHashSet> 3.TreeSet.
		
		Set<String> s = new HashSet<String>();
		s.add("Tom");
		s.add("Mike");
		s.add("Jay");
		s.add("james");
		s.add("Mike");
		System.out.println(s);
		System.out.println(s.size()); // it doesn't take duplicate
		
		//if we want get the specific item we should change to array.
		s.toArray();
		
		Object[] test = s.toArray();
		System.out.println(test[2]);
		
		
		
		
	}

}
