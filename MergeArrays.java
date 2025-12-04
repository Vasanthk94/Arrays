import java.util.Arrays;
class MergeArrays
{
	public static int[] test(int[]arr1,int[]arr2)
	{
		int[]arr3=new int[arr1.length+arr2.length];
		
		int j=0;
		for (int i=0;i<arr3.length ;i++ ) 
		{
			if (i<arr1.length) 
			{
				arr3[i]=arr1[i];
			}
			else
			{
				arr3[i]=arr2[j++];
			}	
		}
		return arr3;
	}
	public static void main(String[] args) 
	{
		int[]arr1={10,20,30};
		int[]arr2={40,50};
		System.out.println(Arrays.toString(test(arr1,arr2)));

	}
}