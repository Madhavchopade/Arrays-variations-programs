
package Arrays;

public class Firstposnextnega {

	public static void main(String[] args) {
		int[] a= {-4,8,-9,6,-2,7,3,-1};
		
		int[] b=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				b[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
