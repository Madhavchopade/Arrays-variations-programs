package Arrays;

public class Insertionsort {

	public static void main(String[] args) {
			int[] a= {1,2,6,5,95,12,4,20};
			
			
			for(int i=0;i<a.length;i++)
			{
				int j=i-1;
				for(;j>=0;j--)
				{
					if(a[j]<a[i])
						break;
				}
				rigthShift(i,j+1,a);
			}
			print(a);
	}		// TODO Auto-generated method stub




	private static void rigthShift(int s, int e, int[] a) {
		int temp=a[s];
		for(int p=s;p>e;p--)
		{
			a[p]=a[p-1];
		}
		a[e]=temp;
	}

	private static void print(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
