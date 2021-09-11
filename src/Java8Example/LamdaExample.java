package Java8Example;

import java.util.ArrayList;

interface A{
	
	void Print(int a);
	
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
	     
	     A a = (f) -> System.out.println(f);
	     a.Print(6);
	   
		
	

	}

}
