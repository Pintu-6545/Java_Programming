package core.java;

public class StaticMethod {
  static int wel=10;
  static int d;
  static void  getData(int c)
  {
	  wel=c;
	  
  }
  static void putData()
  {
      System.out.println("Wel:Show:" + wel);
      System.out.println("D:Show:" + d);
  }
  static 
  {
	     System.out.println("Static Block are Called");
	     d=wel*5;
	     
  }
public static void main(String[] args) {
	     getData(36);
	     putData();
}
}
