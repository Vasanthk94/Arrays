class PalindromeElement
{
	public static void test(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
		int n=arr[i];
		int last=0;
		int temp=arr[i];
		while(n>0)
		{
			int rem=n%10;
			last=last*10+rem;
			n=n/10;
		}
		if(temp==last)
			System.out.println(temp+" is a Palindrome Element"); 
		else
			System.out.println(temp+" is not a Palindrome Element");

	}
}
	public static void main(String[] args) 
	{
		int[]arr={121,324,989,5674};
		test(arr);
	}
}