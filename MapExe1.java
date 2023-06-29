package Map;

import java.util.*;

public class MapExe1 {

	public static void main(String[] args) {
		//Create an Empty HashMap
		
		Map<String , Integer> data = new HashMap<String , Integer>();
		
		// Inserting Paris
		// Using put() method
		
		data.put("Java",4000);
		data.put("HTML",5000);
		data.put("C Lang",6000);
		data.put("Python",7000);
		data.put("Data Structure",8000);
		
		System.out.println(data);
		
		//Get Key
		
		System.out.println("C Lang Value : "+data.get("C Lang"));
		
		for(Map.Entry<String,Integer> m : data.entrySet())
		{
			
			//System.out.println(m);
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		

	}

}
