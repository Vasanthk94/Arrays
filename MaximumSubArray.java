class MaximumSubArray
{
	public static void main(String[] args) {
		int[]arr={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(test(arr));
	}
	public static int test(int[]arr)
	{
		int sum=arr[0];
		int maxSum=arr[0];
		for (int i=1;i<arr.length ;i++ ) 
		{
			if (sum<0) {
				sum=arr[i];
				
			}
			else {
				sum=sum+arr[i];
			}
			maxSum=Math.max(sum,maxSum);
		}
		return maxSum;
	}
}