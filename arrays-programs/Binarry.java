package Arrays;

public class Binarry {

	public static void main(String[] args) {
		int[] a= {45,12,367,15,23,1,45,69,85,23};
		int ele=85;
		int result=binary(a,ele);
		if(result==-1)
			System.out.println("not found");
		else
			System.out.println("found");
	}

	private static int binary(int[] a, int ele) {
		
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(ele==a[mid])
				return mid;
			else if(ele>a[mid])
				i=mid+1;
			else
				j=mid-1;
		}
		return -1;
	}

}
