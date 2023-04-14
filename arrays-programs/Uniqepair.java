package Arrays;

public class Uniqepair {

	public static void main(String[] args) {
		int[] a={1,3,6,4,2,5,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}

}
