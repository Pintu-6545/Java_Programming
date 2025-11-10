package Package2;
import Package1.A;
 class D  extends A {
	public void show() {
        // System.out.println(privateVar); //  Not accessible
        // System.out.println(defaultVar); //  Not accessible (different package)
        System.out.println("Protected Var: " + protectedVar); //  Accessible through inheritance
        System.out.println("Public Var: " + publicVar);       //  Accessible (public)
    }
}

public class  C {
	
	public static void main(String[] args) {
		
		 A obj = new A();
	        // System.out.println(obj.privateVar);  //  Not accessible
	        // System.out.println(obj.defaultVar);  //  Not accessible (different package)
	        // System.out.println(obj.protectedVar);//  Not accessible through object in different package
	        System.out.println("Public Var: " + obj.publicVar); //  Accessible

	        // Using subclass C
	        D cobj = new D();
	        cobj.show();
	}
}