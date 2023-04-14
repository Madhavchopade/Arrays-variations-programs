package Arrays;

public class Saddlepoint {

	public static void main(String[] args) {
		int[][] a= {{6,3,1},{9,7,8},{2,4,5}};
		
		int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				// we take boolean methods to check the smallest and gretest element 
				// if element is not small then it is not saddle point therefore it is not neccessary to check ele is larger 
				
				if(smallestinrow(a,i,j)&&(largestincol(a,i,j)))
				{
						System.out.print(a[i][j]);
						cnt++;
				}
			}
		}
		if(cnt==0)
			System.out.println("no saddle point found");
	}

	private static boolean largestincol(int[][] a, int i, int j) {
		for(int k=0;k<a[i].length;k++)
		{
			if(a[k][j]>a[i][j])
				return false;
		}
		return true;
	}

	private static boolean smallestinrow(int[][] a, int i, int j) {
		
		for(int k=0;k<a[i].length;k++)
		{
			if(a[i][k]<a[i][j])
				return false;
		}
		return true;
	}

}
