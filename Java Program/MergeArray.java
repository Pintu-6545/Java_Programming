package core.java;

public class MergeArray {
	
	    public static void main(String[] args) {
	        int arr1[] = {10, 20, 30};
	        int arr2[] = {40, 50, 60};

	        int n1 = arr1.length;
	        int n2 = arr2.length;

	        int merged[] = new int[n1 + n2];
	        int k = 0;

	        for (int i = 0; i < n1; i++) {
	            merged[k++] = arr1[i];
	        }
	        for (int i = 0; i < n2; i++) {
	            merged[k++] = arr2[i];
	        }

	        System.out.println("Merged Array:");
	        for (int i = 0; i < merged.length; i++) {
	            System.out.print(merged[i] + " ");
	        }
	    }
	}


