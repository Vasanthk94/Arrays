class ThirdMinElement
{
	public static int test(int[]arr)
	{
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int min3=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		 if(arr[i]<min1)
		{
			min3=min2;
			min2=min1;
			min1=arr[i];
		}
		else if(arr[i]<min2&&arr[i]!=min1)
		{
			min2=arr[i];
		}
		else if(arr[i]<min2&&arr[i]!=min2)
		{
			min3=arr[i];
		}
	   }
	return min3;
}

	public static void main(String[] args) 
	{
		int[]arr={10,7,4,2,20,10};
		System.out.println(test(arr));
	}
}