import java.util.Arrays;
class BubbleSort
{
	public static int[] test(int[]arr)
	{
		for (int i=0;i<arr.length ;i++ ) 
		{
			for (int j=0;j<arr.length-i-1 ;j++ ) 
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[]arr={70,30,40,20,60,10};
		System.out.println(Arrays.toString(test(arr)));
	}
}