package Arrays;

public class Uniqepairwithduplicates {

	public static void main(String[] args) {
		int[] a= {1,2,1};
		
		a=removeDuplicate(a);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}

	private static int[] removeDuplicate(int[] a) {
		
		int arrlen=0;
	
			for(int i=0;i<a.length;i++)
			{
				int cnt=0;
				for(int j=0;j<i;j++)
				{
					if(a[i]==a[j])
						cnt++;
				}
				if(cnt==0)
					arrlen++;
			}
			int[] b=new int[arrlen];
			int index=0;
			for(int i=0;i<a.length;i++)
			{
				int cnt=0;
				for(int j=0;j<i;j++)
				{
					if(a[i]==a[j])
						cnt++;
				}
				if(cnt==0)
					b[index++]=a[i];
			}
		
		return b;
	}

}
