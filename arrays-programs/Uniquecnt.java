package Arrays;

public class Uniquecnt {

	public static void main(String[] args) {
		int[] a= {11,22,33,44,55,11,22,44,33,66};
		
		int uniq=0;
				for(int i=0;i<a.length;i++)
				{
					int cnt=0;
					for(int j=0;j<i;j++)
					{
						if(a[i]==a[j])
						{
							cnt++;
							break;
						}
					}
					if(cnt==0)
						uniq++;
				}
				System.out.println(uniq);
				
		
	}

}
