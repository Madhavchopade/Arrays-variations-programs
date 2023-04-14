package Arrays;

public class Secondmaxvalue {

	public static void main(String[] args) {
		int[] a= {66,42,96,3,45,85,72,69,9};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=max && a[i]>max2)
				max2=a[i];
		}
		
		System.out.println("2nd max value is : "+max2);
	}

}
