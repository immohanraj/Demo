package casting.com;

public class Child extends Parent {

@Override
public void city() {

	System.out.println("Chennai");
}
	
public void degree() {
System.out.println("BCA");

}
public static void main(String[] args) {
	Child obb=(Child) new Parent();
	obb.city();
	
	
}
//System.out.println("Pull");
	
}
