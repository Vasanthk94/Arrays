import java.util.Arrays;
class SelectionSort
{

	public static int[] test(int[]arr)
	{
		for (int i=0;i<arr.length;i++) 
		{
			int index=i;
			for (int j=i+1;j<arr.length ;j++ ) 
			{
				if (arr[index]>arr[j]) 
				{
					index=j;
				}
			}
			if (arr[i]!=arr[index]) 
			{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[]arr={70,30,40,20,60,10};
		System.out.println(Arrays.toString(test(arr)));
	}
}