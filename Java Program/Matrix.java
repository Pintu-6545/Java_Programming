package core.java;

public class Matrix {
	    public static void main(String[] args) {
                 int[][] ar = {{10,20,30,40},{50,60,70,80}};
                 int sum=0;
                 for(int i=0;i<ar.length;i++)
                 {
                	 for(int j=0;j<ar[i].length;j++)
                	 {
                		 sum=sum+ar[i][j];
                	 }
                 }
                 System.out.println("Sum:" +sum);
}
}