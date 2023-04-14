package Arrays;

public class Copyarray {

	public static void main(String[] args) {
		int[] a= {1,6,3,4,8,9,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		 System.out.println();
		System.out.println("copy array :");
		
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
