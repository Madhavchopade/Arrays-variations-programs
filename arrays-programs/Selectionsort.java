package Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int[] a= {3,2,6,9,4,1,5,7};
		print(a);
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		print(a);
	}

	private static void print(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
