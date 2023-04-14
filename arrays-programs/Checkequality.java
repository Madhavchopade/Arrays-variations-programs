package Arrays;

public class Checkequality {

	public static void main(String[] args) {
	int[] a= {1,3,6,4,7,9};
	int[] b= {1,3,6,4,7,9};
	
	boolean result=isEqual(a,b);
	if(result==true)
		System.out.println("equal");
	else
		System.out.println("not equal");
	}
	
	public static boolean isEqual(int[]a,int[]b)
	{
		if(a.length!=b.length)
		return false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

}
