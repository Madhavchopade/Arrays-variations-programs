package Arrays;

public class Rightshift {

	public static void main(String[] args) {
		int[] a= {1,9,3,4,5,6,2};
		
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		print(a);
	}

	private static void print(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
