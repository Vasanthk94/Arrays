class MaxElement
{
	public static int test(int[]arr)
	{
	int max=Integer.MIN_VALUE;
	for (int i=0;i<arr.length;i++) 
	 {
		if(arr[i]>max)
		{
		max=arr[i];
	    }
     }
     return max;
	}
	public static void main(String[] args) 
	{
		
	int[]arr={10,60,20,30,50};
	System.out.println(test(arr));
	
    }
}