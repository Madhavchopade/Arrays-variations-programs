package Arrays;

public class Binarysearch {

	public static void main(String[] args) {
			int[] a= {2,6,8,10,12,45};
			
			int num=12;
			
			int result=isfound(a,num);
			if(result==-1)
				System.out.println("not found");
			else
				System.out.println("element found at:"+result);
	}

	private static int isfound(int[] a, int num) {
		
		int s=0;
		int e=a.length-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(a[mid]==num)
				return mid;
			else if(num>a[mid])
				s=mid+1;
			else
				e=mid-1;
		}
		return -1;
	}

}
