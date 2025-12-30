class BinarySearch
{
	public static String test(int[]arr,int element)
	{
		int st=0,end=arr.length-1;
		while(st<=end)
		{
			int mid=(st+end)/2;
			if(element==arr[mid])
				return "element found at "+mid;
			else if(element>arr[mid])
				st=mid+1;
			else if (element<arr[mid]) 
				end=mid-1;

		}
		return "element not found";
	}
	public static void main(String[] args) {
		int[]arr={10,20,30,40,50};
		int element=20;
		System.out.println(test(arr,element));
	}
}
