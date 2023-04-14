package Arrays;

public class Leftrigth {

	public static void main(String[] args) {
		int[] a= {-12,63,15,-63,78,-98};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i<j && a[i]<0 && a[j]>0)
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
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
       }
	}
}
