package Arrays;

public class Maxvalue {

	public static void main(String[] args) {
		int[] a= {-45,-89,-36};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("max value is : "+max);
	}

}
