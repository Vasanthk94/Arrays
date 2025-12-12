class OccuranceElement
{
	public static void test(int[] arr)
	{
		for (int i=0;i<arr.length;i++) 
		{
			int count=1;
			for (int j=i+1;j<arr.length;j++) 
			{
				if (arr[i]==arr[j]) 
				{
					arr[j]=Integer.MAX_VALUE;
					count++;
				}
			}
			if (arr[i]!=Integer.MAX_VALUE) 
			{
				System.out.println(arr[i]+"="+count);
			}
		}
	}
	public static void main(String[] args) {
		int[]arr={10,20,30,10,20,30,40,10,50};
		test(arr);

	}
}