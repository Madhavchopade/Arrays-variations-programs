package Arrays;

public class ContainSpecificValue {

	public static void main(String[] args) {
		int[] a= {51,9,6,1,4,7,5,3,6,74};
		int value=44;
		
		boolean result=isValueFound(a,value);
		if(result==true)
			System.out.println("found");
		else
			System.out.println("not found");
	}

	private static boolean isValueFound(int[] a, int value) 
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
				return true;
			
		}
		return false;
	}

}
