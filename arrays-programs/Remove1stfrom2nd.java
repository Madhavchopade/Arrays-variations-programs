package Arrays;

public class Remove1stfrom2nd {

	public static void main(String[] args) {
		int[] n= {1,2,4};
		int[] a= {1,1,1,1,1,2,2,3,4,5,6};
		
		for(int i=0;i<n.length;i++)
		{
			a=remove(a,n[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}

	private static int[] remove(int[] a, int num) 
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				cnt++;
		}
		if(cnt>2)
			cnt=2;
		
		int[] b=new int[a.length-cnt];
		int index=0;
		int removecnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(removecnt==2 || a[i]!=num)
				b[index++]=a[i];
			else
				removecnt++;
		}
		return b;
	}
}