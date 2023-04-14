package Arrays;

public class Insertion {

	public static void main(String[] args) {
		int[] a = { 25, 36, 4, 56, 8, 39, 72, 1, 56 };
		for (int i = 0; i < a.length; i++) 
		{
			int j=i-1;
			for(;j>=0;j--)
			{
				if(a[i]>a[j])
					break;
				
			}
			rightshift(a,i,j+1);

		}
		print(a);
	}

	private static void print(int[] a) {
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
	}

	private static void rightshift(int[] a, int i, int j) {
		int temp=a[i];
		for(int k=i;k>j;k--)
		{
			a[k]=a[k-1];
		}
		a[j]=temp;
	}

}