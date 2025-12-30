class MaxElementyEachRow
{
	public static void main(String[] args) {
		int[][]arr={{10,80,30},{40,60,50}};
		
		for (int i=0;i<arr.length ;i++ ) 
		{
			int max=Integer.MIN_VALUE;
			
			for (int j=0;j<arr[i].length ;j++ ) 
			{
				if (arr[i][j]>max) 
				{
					max=arr[i][j];	
				}
				
			}
			System.out.println(max);
		}
		
	}
}