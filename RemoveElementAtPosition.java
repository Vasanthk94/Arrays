import java.util.Arrays;
class RemoveElementAtPosition
{
	public static int[] test(int[]arr)
	{
		int[]arr2=new int[arr.length-1];
		int j=0;
		int index=1;
		for (int i=0;i<arr.length;i++ ) 
		{
			if(i!=index)
			{
			 arr2[j++]=arr[i];
			}

		}
		return arr2;
	}
	public static void main(String[] args) {
		int[]arr={10,20,30,40};
		System.out.println(Arrays.toString(test(arr)));
	}
}