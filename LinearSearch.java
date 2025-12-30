class LinearSearch
{
	public static String test(int[]arr,int element)
	{
		int st=0,end=arr.length-1;
		for (int i=0;i<arr.length ;i++ ) 
		{
			if(element==arr[i])
				return "element found at "+i;
			
		}
		return "element not found";
	}
	public static void main(String[] args) {
		int[]arr={10,20,30,40,50};
		int element=20;
		System.out.println(test(arr,element));
	}
}