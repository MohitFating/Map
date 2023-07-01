package Map;

import java.util.*;

public class MapExe2 {

	public static void main(String[] args) {
	
		int a[] = {1,2,2,33,4,4,4,55,66,77,8,8,90};
		ArrayList<Integer> data = new ArrayList();
		for (int i = 0; i < a.length ; i++)
		{
			data.add(a[i]);
		}
		
		HashMap<Integer,Integer>data1 = new HashMap();
		
		for (int i=0;i<data.size();i++)
		{
			data1.putIfAbsent(data.get(i) , Collections.frequency(data, data.get(i)));
			
		}
		
		System.out.println(data1);

	}

}
