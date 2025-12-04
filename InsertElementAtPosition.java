import java.util.Arrays;
class InsertElementAtPosition
{
	public static int[] test(int[]arr)
	{
		int[]arr2=new int[arr.length+1];
		int element=30;
		int index=2;
		
		for (int i=0;i<index ;i++ ) 
		{
			arr2[i]=arr[i];
		}
		arr2[index]=element;
		for (int i=index;i<arr.length ;i++ ) 
		{
			arr2[i+1]=arr[i];
			
		}
		return arr2;
	}
	public static void main(String[] args) {
		int[]arr={10,20,40};
		System.out.println(Arrays.toString(test(arr)));

	}
}