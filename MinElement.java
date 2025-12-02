class MinElement
{
	public static int test(int[]arr)
	{
		int min=Integer.MAX_VALUE;// or arr[0];
		for (int i=0;i<arr.length;i++ )
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int[]arr={40,10,20,5,80};
		System.out.println(test(arr));
	}
}