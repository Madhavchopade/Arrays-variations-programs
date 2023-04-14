package Arrays;

public class Ledder {

	public static void main(String[] args) {
		
		int[] a= {2,44,61,2,4,63,58,9,7,12};
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
					cnt++;
			}
			if(cnt==0)
				System.out.print(a[i]+" ");
		}
	}

}
