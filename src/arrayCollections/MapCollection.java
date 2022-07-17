package arrayCollections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		// We have 3 type of Map collection
		//Map:  HashMap, SetMap, TreeMap
		//In Map collection we are warried about the key value which Integer in below example.
		//The formula is as below
		//Map<KeyObjectDataType, ValueObjectDataType> objName = new MapType<KeyObjectDataType, ValueObjectDataType>();
 
//		Map<Integer, String> abc = new HashMap<Integer, String>();
//		
//		
//		abc.put(45, "Mike"); // in this Map Collection we use put instead of add.
//		abc.put(50, "Jay");
//		abc.put(30, "Gowhar");
//		abc.put(50, "Mike");
//		abc.put(45, "Tom");
//		System.out.println(abc.size()); // HashMap do not allow duplicate keyvalu which is Integer
//		System.out.println(abc);
//		System.out.println(abc.keySet());// keySet is print all key values
		
		//Interview Question: Have you ever worked with value pairs in Java?
		//Yes, what's that can you explain. the keyset value is of the thing that use at work called Map collections. There's key that has value
		//the value can be repeat but the key can not be repeat but it does repeat it will over the old keyvalue with the new
//		System.out.println("=================================");
		
		Map<Integer, String> aB = new SetMap<Integer, String>();
		aB.put(45, "Mike"); // in this Map Collection we use put instead of add.
		aB.put(50, "Jay");
		aB.put(30, "Gowhar");
		aB.put(50, "Mike");
		aB.put(45, "Tom");
		
	}

	
}
