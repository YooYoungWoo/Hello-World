class X {
	int m = 0;
}
class Y extends X {
	int m = 1;
}
public class HidingTest {	
    public static void main(String[] args) {
	    X x1 = new X();
	    Y y1 = new Y();
	    System.out.println("x1.m=" + x1.m + " y1.m=" + y1.m + " ((X)y1).m=" + ((X)y1).m);
	} // 0 1 0
}




