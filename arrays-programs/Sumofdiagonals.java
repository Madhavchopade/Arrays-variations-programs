package Arrays;

public class Sumofdiagonals {

	public static void main(String[] args) {
		int[][] a= {{5,1,3,1},
				{2,4,3,2},
				{4,3,2,3},
				{1,2,3,4}};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(j-i==0)
				sum+=a[i][j];
				
			}
		}
		System.out.println(sum);
		
			
	}

}
