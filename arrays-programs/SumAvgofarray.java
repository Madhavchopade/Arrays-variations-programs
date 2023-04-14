package Arrays;

public class SumAvgofarray {

	public static void main(String[] args) {
		int[] a= {14,36,25,96,63};
		
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of array is : "+sum);
 
			double avg=sum/a.length;
			System.out.println("avg of array : "+avg);
	
	}

}
