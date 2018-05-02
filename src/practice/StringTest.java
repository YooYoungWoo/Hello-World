class Obj {
	String s1;
	String s2;
}

public class StringTest {
	public static void main(String[] args) {
	Obj X1 = new Obj();
	Obj X2 = new Obj();
	
        if(X1.equals(X2)) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}
}
