package Arrays;

public class Evenoddarray {

	public static void main(String[] args) {
		int[] a= {37,2,6,8,4,9,14,11,87,36,31,25,1};
		
		int evencnt=0;
		int oddcnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evencnt++;
			else
				oddcnt++;
		}
		System.out.println(evencnt);
		System.out.println(oddcnt);
		
		int[] even=new int[evencnt];
		int[] odd=new int[oddcnt];
		
		int ei=0;
		int oi=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[ei]=a[i];
			    ei++;
			}
			else
			{
				odd[oi]=a[i];
				oi++;
			}
		}
		System.out.println();
		for(int i=0;i<even.length;i++)
		{
			System.out.print(even[i]+" ");
		}
		
		
		System.out.println();
		for(int i=0;i<odd.length;i++)
		{
			System.out.print(odd[i]+" ");
		}
	}

}