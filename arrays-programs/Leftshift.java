package Arrays;

public class Leftshift {

	public static void main(String[] args) {
			int[] a= {1,3,6,4,2,5,8,9};
			
			print(a);
			int temp=a[0];
			
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			
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
