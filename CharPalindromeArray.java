class CharPalindromeArray
{
    public static String test(char[]arr)
    {
    	int start=0,end=arr.length-1;
		while(start<end)
		{
			if(arr[start]!=arr[end])
			{
				return "Given Character Array is not palindrome";
			}
			else
			{
			start++;
			end--;
		    }
		}
		    return "Given Character Array is palindrome";
		
    }
	public static void main(String[] args)
	{
		char[]arr={'k','s','v','s','k'};
		System.out.println(test(arr));
	}


}