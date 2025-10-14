package core.java;

class Wel {
	int v=45;
	int c=69;
	   Wel()
	   {
		   this.v=v;
		   this.c=c;
	   }
	   void getData(int g,int j)
	   {
		   this.v=g;
		   this.c=j;
	   }
	   void view()
	   {
		   System.out.println("Show:Data" + this.v);
		   System.out.println("Show:Data" + this.c);
	   }
	   void den(int a ,int b)
	   {
		   this.v=a;
		   this.c=b;
		   int t= this.v + this.c;
		   System.out.println("Sum:" +t);
	   }
}
public class This {

	   public static void main(String [] args)
	   {
		   Wel w1 =new Wel();
		   w1.view();
		   w1.den(56,55);
	   }
}
