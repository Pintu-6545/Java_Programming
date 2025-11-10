package Package1;

public class A {

	private int privateVar = 10;
    int defaultVar = 20; // default access
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void showData() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
}
}

 class B
{
	 public void display() {
	        A obj = new A();
	        // System.out.println(obj.privateVar); //  Not accessible
	        System.out.println("Default Var: " + obj.defaultVar);   //  Accessible (same package)
	        System.out.println("Protected Var: " + obj.protectedVar); // Accessible (same package)
	        System.out.println("Public Var: " + obj.publicVar);     //  Accessible (public)
	    }
}
