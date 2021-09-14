package Java8Example;

import java.util.ArrayList;

interface A{
	
	void add(int a, int b);
	
	default public void method1(int a) {
		
		
	}
}
public class LamdaExample {

	public static void main(String[] args) {
		
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");
	      
	     list.forEach(s -> System.out.println(s));
	     
	     A a = (b,c) -> System.out.println(b*c);
	     a.add(6,3);
	     
	     
	   
		
	

	}

}
