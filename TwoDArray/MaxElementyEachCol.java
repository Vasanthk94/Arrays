class MaxElementyEachCol
{
	public static void main(String[] args) {
		int[][]arr={{10,80,30},{40,60,50},{10,40,59}};
		
		for (int i=0;i<arr.length;i++ ) 
		{
			int max=Integer.MIN_VALUE;
			
			for (int j=0;j<arr.length ;j++ ) 
			{
				if (arr[j][i]>max) 
				{
					max=arr[j][i];	
				}
				
			}
			System.out.println(max);
		}
	}
}