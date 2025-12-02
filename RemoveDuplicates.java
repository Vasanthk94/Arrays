import java.util.Arrays;
class RemoveDuplicates
{
	public static int[] test(int[]arr)
	{
		int count=0;
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=i+1;j<arr.length;j++ )
			{
				if(arr[i]==arr[j]&&arr[i]!=Integer.MAX_VALUE)
				{
					count++;
					arr[j]=Integer.MAX_VALUE;
				}
			}
		}
		int[]b=new int[arr.length-count];
		int j=0;
		for (int i=0;i<arr.length ;i++) 
		{
				if(arr[i]!=Integer.MAX_VALUE)
					b[j++]=arr[i];
		}
		return b;
	} 
	public static void main(String[] args) {
		int []arr={10,20,10,30,30,40};
		System.out.println(Arrays.toString(test(arr)));

	}
}