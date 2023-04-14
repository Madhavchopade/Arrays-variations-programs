package Arrays;

public class Evenoddcnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,45,13,69,78,12,3,6,4,7};
		int evencnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evencnt++;
		}
		
		int[] even=new int[evencnt];
		int[] odd=new int[a.length-evencnt];
		
		int ei=0;
		int oi=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				even[ei++]=a[i];
			else
				odd[oi++]=a[i];
			
		}
		
		print(even);
		System.out.println();
		print(odd);
	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
