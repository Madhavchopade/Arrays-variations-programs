package Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] a= {3,2,8};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		print(a);
	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
