package Arrays;

public class Saddle2 {


	public static void main(String[] args) {
		int[][] a= {{6,3,1},{9,7,8},{2,4,5}};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(saddle1(a,i,j)&&(saddle2(a,i,j)))
				{
					System.out.println(a[i][j]+" ");
					cnt++;
				}
					
			}
		}
			if(cnt==0)
				System.out.println("no ssaddlr point");
		

	}

	private static boolean saddle2(int[][] a, int i, int j) {
		
		for(int k=0;k<a[i].length;k++) 
		{
			if(a[i][k]<a[i][j])
				return false;
			}
				return true;
	}

	private static boolean saddle1(int[][] a, int i, int j) {
		for(int k=0;k<a[i].length;k++)
		{
			if(a[k][j]>a[i][j])
				return false;
		}
		return true;
	}

}
