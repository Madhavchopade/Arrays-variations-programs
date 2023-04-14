package Arrays;

public class Selectionnsort {

	public static void main(String[] args) {
		int[] a= {12,2,36,5,123,45,96,74,125};
		for(int i=0;i<a.length;i++)
		{
			int b=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[b])
					b=j;
			}
			int temp=a[i];
			a[i]=a[b];
			a[b]=temp;
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
