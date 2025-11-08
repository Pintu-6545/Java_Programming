package Demo.com;

abstract class Demo{
 
	   static int a=5 ;
	  static void Cube()
	   {
		   int square;
		   square=a*a;
		   System.out.println("Square The Value:" + square);
	   }
	abstract void data();
	
}
class Demo1 extends Demo
{

	void data() {
		
		System.out.println("Welcome to Database Management System");
		
	}
	
}

public class AbtractData {

	public static void main(String[] args) {
		
		Demo1 d1 =new Demo1();
		Demo1.Cube();
		d1.data();
	}
}
