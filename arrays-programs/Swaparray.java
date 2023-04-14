package Arrays;

public class Swaparray {

	public static void main(String[] args) {

		 int[] a= {2,3,6,4,5,7};
		 print(a);
		 int i=0;
		 int j=a.length-1;
		 
         while(i<j)
		 {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 i++;
			 j--;
		 }
         System.out.println();
		 print(a);
		 }

	private static void print(int[] a) {
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 		
	}
	}
}


