package Java8Example;
class Parent {

	static void m1() {
		System.out.println("PArent static mathod");
	}

	public void m2() {
		System.out.println("Parent m2 method");
	}

}

public class Lamda extends Parent {

	static void m1() {
		System.out.println("child static method");
	}

	
	  public void m2() { System.out.println("Parent M2 overridden"); }
	 
	public static void main(String[] args) {

		
		Parent p=new Lamda();
		Parent p1=new Parent();
		
		
		p.m2();
		Lamda l=new Lamda();
		l.m2();
		
		
	}
}
