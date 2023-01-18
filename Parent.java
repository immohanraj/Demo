package casting.com;

public class Parent {

	public void city() {

		System.out.println("Villupuram");
	}
	
	public void property() {
System.out.println("House");
	}
	
	public static void main(String[] args) {
		
		Parent obj= new Child();
		
		obj.city();
		obj.property();
	}
}
