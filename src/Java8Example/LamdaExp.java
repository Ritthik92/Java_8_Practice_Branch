package Java8Example;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


interface Calculator {

	void calculater(int a, int b);
}

public class LamdaExp {

	public static  void main(String[] args) {

		Calculator cal = (a, b) -> System.out.println("Sum" + (a + b));

		cal.calculater(10, 20);
		
		
		HashMap<Integer, String> hasmap=new HashMap<>();
		hasmap.put(1, "karthi");
		hasmap.put(2, "mani");
		hasmap.put(3, "sri");
		
		/*
		 * Set entry=hasmap.entrySet();
		 * 
		 * Iterator itr=entry.iterator(); while(itr.hasNext()) { Map.Entry ent= (Entry)
		 * itr.next(); System.out.println(ent.getKey()+ " " +ent.getValue());
		 * 
		 * }
		 */
		for(Map.Entry<Integer, String> entry:hasmap.entrySet())
		{
			System.out.println(entry.getKey());
		}

		
		
		
		

	}

}
