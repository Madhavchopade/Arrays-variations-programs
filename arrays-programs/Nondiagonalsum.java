package Arrays;

public class Nondiagonalsum {

	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{5,6,7,8},{9,4,2,5},{7,2,4,9}};
		int cnt=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if( j!=0 && i!=0 && i!=a.length-1 && j!=a.length-1)
				{		
					sum+=a[i][j];
				cnt++;
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);

	}

}
